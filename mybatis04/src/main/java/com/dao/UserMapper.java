package com.dao;

import com.Pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUsers();

    @Select("select * from user where id = #{id}")
    User getuserbyID(@Param("id")int id);
}
