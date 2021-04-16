package com.dao;

import com.Pojo.Student;
import com.Pojo.Teacher;
import com.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class MyTest {
   @Test
   public void test01() {
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1:student){
            System.out.println(student1);
        }
        sqlSession.close();
    }

}
