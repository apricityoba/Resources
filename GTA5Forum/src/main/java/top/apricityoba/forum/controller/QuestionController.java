package top.apricityoba.forum.controller;

import top.apricityoba.forum.dto.*;
import top.apricityoba.forum.enums.CommentTypeEnum;
import top.apricityoba.forum.exception.CustomizeErrorCode;
import top.apricityoba.forum.exception.CustomizeException;
import top.apricityoba.forum.model.Question;
import top.apricityoba.forum.service.CommentService;
import top.apricityoba.forum.service.QuestionService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private Environment env;

    @Value("${vaptcha.vid}")
    private String vaptcha_vid;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id, Model model) {
        return "redirect:/p/" + id;
    }


    @GetMapping(value = {"/p/{id}", "/article/{id}"})
    public String po(@PathVariable(name = "id") Long id, HttpServletRequest request, Model model, @RequestParam(name = "to", required = false) String to) {
        UserDTO viewUser = (UserDTO) request.getAttribute("loginUser");
        Long viewUser_id;
        if (viewUser == null) {
            viewUser_id = 0L;
        } else viewUser_id = viewUser.getId();
        QuestionDTO questionDTO = questionService.getById(id, viewUser_id);
        //UserAccount userAccount = (UserAccount)request.getSession().getAttribute("userAccount");
        if (viewUser == null) {
            if (questionDTO.getPermission() != 0) {
                model.addAttribute("rsTitle", "??????????????????");
                model.addAttribute("rsMessage", "?????????????????????????????????????????????????????????");
                return "result";
            }
        } else if (questionDTO.getPermission() > viewUser.getGroupId() && !questionDTO.getCreator().equals(viewUser.getId())) {
            model.addAttribute("rsTitle", "??????????????????");
            model.addAttribute("rsMessage", "??????????????????" + env.getProperty("user.group.r" + questionDTO.getPermission()) + "???????????????????????????????????????????????????????????????????????????VIP???????????????");
            return "result";
        }
        List<QuestionDTO> relatedQuestions = questionService.selectRelated(questionDTO);
        List<CommentDTO> comments = commentService.listByTargetId(id, CommentTypeEnum.QUESTION);
        //???????????????
        questionService.incView(id);
        //????????????????????????
        String description = questionDTO.getDescription();
        String textDescription = description.replaceAll("</?[^>]+>", ""); //??????<html>?????????
        textDescription = textDescription.replaceAll("<a>\\s*|\t|\r|\n</a>", "");//???????????????????????????,??????,?????????,?????????
        textDescription = textDescription.replaceAll("&nbsp;", "");//??????&nbsp;
        if (textDescription.length() > 100) textDescription = textDescription.substring(0, 100);
        //System.out.println(textDescription);
        model.addAttribute("textDescription", questionDTO.getTitle() + ".." + textDescription);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        model.addAttribute("relatedQuestions", relatedQuestions);
        model.addAttribute("navtype", "communitynav");
        model.addAttribute("vaptcha_vid", vaptcha_vid);
        if ("article".equals(to)) return "home/detail";
        return "p/detail";
    }

    @PostMapping("/p/del/id")
    @ResponseBody
    public Map<String, Object> delQuestionById(HttpServletRequest request,
                                               @RequestParam(name = "id", defaultValue = "0") Long id) {

        UserDTO user = (UserDTO) request.getAttribute("loginUser");
        //UserAccount userAccount = (UserAccount) request.getSession().getAttribute("userAccount");
        if (user == null) {
            throw new CustomizeException(CustomizeErrorCode.NO_LOGIN);
        }
        Map<String, Object> map = new HashMap<>();
        if (id == null || id == 0) {
            map.put("code", 500);
            map.put("msg", "????????????????????????");
        } else {

            int c = questionService.delQuestionById(user.getId(), user.getGroupId(), id);
            if (c == 0) {
                map.put("code", 500);
                map.put("msg", "?????????????????????????????????????????????");
            } else {
                map.put("code", 200);
                map.put("msg", "????????????????????????" + c + "????????????");
            }
        }
        return map;

    }

    @ResponseBody
    @RequestMapping(value = "/api/question/list", method = RequestMethod.POST)
    public ResultDTO<List<CommentDTO>> questionList(
            /*@RequestParam(name = "commentator",required = false) Long commentator
            ,@RequestParam(name = "type",required = false) Integer type
            ,@RequestParam(name = "id",required = false) Long id
            ,@RequestParam(name = "parentId",required = false) Long parentId*/
            @RequestBody QuestionQueryDTO questionQueryDTO
    ) {
        PaginationDTO paginationDTO = questionService.listByQuestionQueryDTO(questionQueryDTO);


        return ResultDTO.okOf(paginationDTO);
    }


    @PostMapping("/p/set/id")
    @ResponseBody
    public Map<String, Object> setQuestionById(HttpServletRequest request,
                                               @RequestParam(name = "id", defaultValue = "0") Long id
            , @RequestParam(name = "rank", required = false) Integer rank
            , @RequestParam(name = "field", required = false) String field
            , @RequestParam(name = "json", required = false) String json) {

        UserDTO user = (UserDTO) request.getAttribute("loginUser");
        //UserAccount userAccount = (UserAccount) request.getSession().getAttribute("userAccount");
        if (user == null) {
            throw new CustomizeException(CustomizeErrorCode.NO_LOGIN);
        }
        Map<String, Object> map = new HashMap<>();
        if (id == null || id == 0 || field == null) {
            map.put("code", 500);
            map.put("msg", "????????????????????????");
            return map;
        }
        Question question = questionService.getQuestionById(id);
        if (!(question.getCreator().longValue() == user.getId() || user.getGroupId() >= 18)) {
            map.put("code", 500);
            map.put("msg", "???????????????????????????");
            return map;
        }
        if ("stick".equals(field)) {
            if (rank == 1) question.setStatus(question.getStatus() | 2);
            if (rank == 0) question.setStatus(question.getStatus() & 253);
        }
        if ("essence".equals(field)) {
            if (rank == 1) question.setStatus(question.getStatus() | 1);
            if (rank == 0) question.setStatus(question.getStatus() & 254);
        }
        if ("promote".equals(field)) {
            question.setGmtLatestComment(System.currentTimeMillis());
        }
        if ("admin".equals(field)) {
            JSONObject obj = JSON.parseObject(json);
            question.setColumn2(obj.getInteger("column2"));
            question.setPermission(obj.getInteger("permission"));
        }
        if (questionService.updateQuestion(question) == 1) {
            map.put("code", 200);
            map.put("msg", "???????????????????????????");
        }
        return map;

    }


}
