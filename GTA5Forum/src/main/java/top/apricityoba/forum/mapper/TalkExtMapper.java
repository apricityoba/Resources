package top.apricityoba.forum.mapper;

import top.apricityoba.forum.dto.TalkQueryDTO;
import top.apricityoba.forum.model.Talk;

public interface TalkExtMapper {

    Integer count(TalkQueryDTO talkQueryDTO);

    int updateByPrimaryKeySelective(Talk talk);
}
