package top.apricityoba.forum.mapper;

import top.apricityoba.forum.dto.UserQueryDTO;
import top.apricityoba.forum.model.User;

import java.util.List;

public interface UserExtMapper {
    List<User> selectLatestLoginUser(UserQueryDTO userQueryDTO);
    Integer count(UserQueryDTO userQueryDTO);
}
