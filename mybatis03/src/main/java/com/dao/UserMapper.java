package com.dao;

import com.Pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserbyID(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
