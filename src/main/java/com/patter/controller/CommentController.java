package com.patter.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class CommentController {

    @RequestMapping("/imran")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
