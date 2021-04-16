import com.dao.BlogMapper;
import com.pojo.Blog;
import com.utils.IDutils;
import com.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("all")
public class Mytest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getID());
        blog.setTitle("helloworld");
        blog.setAuthor("zjy");
        blog.setCreateTime(new Date());
        blog.setViews(98988);

        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("xayddx");
        blog.setAuthor("lyh");
        blog.setCreateTime(new Date());
        blog.setViews(9689);

        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("klxq");
        blog.setAuthor("nzt");
        blog.setCreateTime(new Date());
        blog.setViews(12346);

        mapper.addBlog(blog);

        sqlSession.close();




    }
    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        //hashMap.put("title","klxq");
        hashMap.put("author","zjy");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryChoose(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("views","98988");
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","happy");
        hashMap.put("author","zjy");
        hashMap.put("views","4564");
        hashMap.put("id","ac5f38c8eb694c6dbd0cff92ab0c1668");
        int i = mapper.updateBlog(hashMap);

        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = Mybatisutils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        hashMap.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
