import com.dao.UserMapper;
import com.pojo.User;
import com.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void test1(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.queryUserByID(1);
        System.out.println(users);
        mapper.updateUser(new User(2,"zyl","46516"));
        List<User> users2 = mapper.queryUserByID(1);
        System.out.println(users2);
        System.out.println(users==users2);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        SqlSession sqlSession2 = Mybatisutils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUserByID(1);
        System.out.println(users);
        sqlSession.close();

        UserMapper mapper1 = sqlSession2.getMapper(UserMapper.class);
        List<User> users1 = mapper1.queryUserByID(1);
        System.out.println(users1);
        sqlSession2.close();
    }
}
