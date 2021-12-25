package top.apricityoba.forum.cache;

import top.apricityoba.forum.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();

        TagDTO common = new TagDTO();
        common.setCategoryName("常用");
        common.setTags(Arrays.asList("笔记", "讨论", "闲聊", "教程", "公告", "灌水", "测试"));
        tagDTOS.add(common);

        TagDTO program = new TagDTO();
        program.setCategoryName("热门游戏");
        program.setTags(Arrays.asList("王者荣耀", "和平精英", "英雄联盟", "GTA5", "荒野大镖客", "穿越火线", "云顶之弈", "第五人格"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("网页游戏");
        framework.setTags(Arrays.asList("三国杀", "传奇", "斗地主", "弹弹堂", "热血三国", "QQ农场", "QQ牧场"));
        tagDTOS.add(framework);


        TagDTO server = new TagDTO();
        server.setCategoryName("PC游戏");
        server.setTags(Arrays.asList("绝地求生", "英雄联盟", "炉石传说", "穿越火线", "逆水寒", "cs:go", "魔兽世界", "地下城与勇士", "负载均衡"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("主机游戏");
        db.setTags(Arrays.asList("GTA5", "荒野大镖客2", "使命召唤", "森林", "蜘蛛侠", "鬼泣5", "刺客信条", "战神4", "神秘海域"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("手机游戏");
        tool.setTags(Arrays.asList("王者荣耀", "和平精英", "我的世界", "QQ飞车", "天天酷跑", "穿越火线", "使命召唤", "第五人格" ));
        tagDTOS.add(tool);

        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> StringUtils.isBlank(t) || !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }
}
