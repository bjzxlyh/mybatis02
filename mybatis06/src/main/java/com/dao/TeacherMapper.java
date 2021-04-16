package com.dao;

import com.Pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
   List<Teacher> getTeacher();
   //获取老师信息以及老师的学生
   Teacher getTeacher02(@Param("tid")int id);
}
