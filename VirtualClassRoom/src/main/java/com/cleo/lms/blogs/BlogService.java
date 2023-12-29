package com.cleo.lms.blogs;

public interface BlogService {

    Blog createBlog(Blog blog);

    Iterable<Blog> getAllBlogs();

    Blog getBlogById(Long id);

}
