package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String postsIndex(){
        return "posts/index";
    }
    @GetMapping("/posts{id}")
    @ResponseBody
    public String postById(@PathVariable String id){
        return "show/"+id;
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreate(){
        return "view form for creating posts";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreatePostMap(){
        return "Create a new post";
    }
}
