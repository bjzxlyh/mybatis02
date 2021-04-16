import com.Pojo.Teacher;
import com.dao.TeacherMapper;
import com.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {
    @Test
    public void test01(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher02 = mapper.getTeacher02(1);
        System.out.println(teacher02);
        sqlSession.close();
    }
}
