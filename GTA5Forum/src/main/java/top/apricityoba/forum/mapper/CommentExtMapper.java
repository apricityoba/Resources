package top.apricityoba.forum.mapper;

import top.apricityoba.forum.dto.CommentQueryDTO;
import top.apricityoba.forum.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);

    Integer countBySearch(CommentQueryDTO commentQueryDTO);

}
