package top.apricityoba.forum.mapper;

import top.apricityoba.forum.model.UserAccount;

public interface UserAccountExtMapper {

    int incScore(UserAccount userAccount);
    int decScore(UserAccount userAccount);
}
