package com.cleo.lms.web;

import com.cleo.lms.blogs.BlogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/blogs")
public class PostController {

    private final BlogServiceImpl blogService;

    @Autowired
    public PostController(BlogServiceImpl blogService) {
        this.blogService = blogService;
    }


}
