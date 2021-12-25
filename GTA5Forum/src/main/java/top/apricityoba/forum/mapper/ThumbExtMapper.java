package top.apricityoba.forum.mapper;

import top.apricityoba.forum.dto.LikeQueryDTO;
import top.apricityoba.forum.model.Comment;
import top.apricityoba.forum.model.Question;

public interface ThumbExtMapper {
    int incLikeCount(Comment comment);

    int incQuestionLikeCount(Question question);

    Integer count(LikeQueryDTO likeQueryDTO);
}
