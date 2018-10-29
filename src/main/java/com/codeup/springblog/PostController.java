package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsPage(){
        return "posts index page";
    }
    @GetMapping("/posts{id}")
    @ResponseBody
    public String postById(){
        return "view individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreate(){
        return "view form for creating posts";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreatePostMap(){
        return "create a new post";
    }
}
