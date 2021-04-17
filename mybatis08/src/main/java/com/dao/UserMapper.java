package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryUserByID(@Param("id")int id);

    int updateUser(User user);
}
