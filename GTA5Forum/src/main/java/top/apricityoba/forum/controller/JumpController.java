package top.apricityoba.forum.controller;

import top.apricityoba.forum.dto.PaginationDTO;
import top.apricityoba.forum.dto.UserDTO;
import top.apricityoba.forum.dto.UserQueryDTO;
import top.apricityoba.forum.exception.CustomizeErrorCode;
import top.apricityoba.forum.exception.CustomizeException;
import top.apricityoba.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class JumpController {
    @Autowired
    private UserService userService;

    @GetMapping("/jump")
    public String jump(
            HttpServletRequest request,
            Model model
            ,@RequestParam(name = "type") String type
            ,@RequestParam(name = "target") String target){

        if("user_home".equals(type)){
            UserQueryDTO userQueryDTO = new UserQueryDTO();
            userQueryDTO.setName(target);
            userQueryDTO.convert();
            PaginationDTO paginationDTO = userService.list(userQueryDTO);
            List<UserDTO> userDTOs = paginationDTO.getData();
            if(userDTOs.size()!=1)
                throw new CustomizeException(CustomizeErrorCode.USER_IS_EMPTY);
            return "redirect:/user/"+userDTOs.get(0).getId();
        }



        return "redirect:/forum";
    }



}
