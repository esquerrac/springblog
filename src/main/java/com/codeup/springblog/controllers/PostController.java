package com.codeup.springblog.controllers;

import com.codeup.springblog.Models.Post;
import com.codeup.springblog.services.PostSvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        Post newPost = postsvc.createPost(post);
        return "redirect:/posts/"+newPost.getId();
    }

    @GetMapping("/posts/{id}/update")
    public String postUpdateForm(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", postsvc.findOne(id));
        return "posts/update";
    }

    @PostMapping("/posts/{id}/update")
    public String postUpdated(@PathVariable int id, @ModelAttribute Post post){
        postsvc.updatePost(post);
        return "redirect:/posts/"+id;
    }
    @PostMapping("/posts/{id}/delete")
    public String postDelete (@PathVariable int id, @ModelAttribute Post post){
        postsvc.deletePost(post);
        return "redirect:/posts";
    }

}
