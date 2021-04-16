package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    //查询1,2,3号记录的博客
    List<Blog> queryBlogForeach(Map map);

}
