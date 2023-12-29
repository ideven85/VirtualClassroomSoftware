package com.cleo.lms.blogs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Blog with given id not found")
public class BlogNotFoundException extends RuntimeException{

    public BlogNotFoundException() {
    }

    public BlogNotFoundException(String message) {
        super(message);
    }
}
