package com.dao;

import com.Pojo.User;
import com.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        //获得session对象
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        //执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserbyID(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userbyID = mapper.getUserbyID(1);
        System.out.println(userbyID);

        sqlSession.close();
    }
    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int cz = mapper.addUser(new User(4, "cz", "78456"));
        if (cz > 0){
            System.out.println("success");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int sbr = mapper.updateUser(new User(4, "sbr", "456"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }
}
