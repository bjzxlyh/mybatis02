import com.Pojo.User;
import com.dao.UserMapper;
import com.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void getUsers(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for(User user :users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
