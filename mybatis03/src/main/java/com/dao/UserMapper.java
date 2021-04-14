package com.dao;

import com.Pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserbyID(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);

}
