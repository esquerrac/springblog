package com.codeup.springblog;

import com.codeup.springblog.services.PostSvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class PostController {
    private PostSvc postsvc;


    public PostController(PostSvc postsvc){
        this.postsvc = postsvc;
    }


    @GetMapping("/posts")
    public String postsIndex(Model vModel){
        vModel.addAttribute("posts", postsvc.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", postsvc.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postCreateForm(Model vModel){
        vModel.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postCreated(@ModelAttribute Post post){
        Post newPost = postsvc.save(post);
        int id = newPost.getId();
        return "redirect:/posts/"+id;
    }

    @GetMapping("/posts/{id}/update")
    public String postUpdateForm(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", postsvc.findOne(id));
        return "posts/update";
    }

    @PostMapping("/posts/{id}/update")
    public String postUpdated(@PathVariable int id, @ModelAttribute Post post){
        postsvc.save(post);
        return "redirect:/posts/"+id;
    }

}
