package com.codeup.springblog.controllers;

import com.codeup.springblog.Models.Post;
import com.codeup.springblog.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private PostSvc postsvc;
    private UserSvc usersvc;
    private CatSvc catsvc;

//    @Autowired
//    private UsersRepo usersRepo;
//
//    @Autowired
//    private PostsRepo postsRepo;
//
//    @Autowired
//    private CategoriesRepo catRepo;


    public PostController(PostSvc postsvc, UserSvc usersvc, CatSvc catsvc ){
        this.postsvc = postsvc;
        this.usersvc = usersvc;
        this.catsvc = catsvc;
    }



    @GetMapping("/posts")
    public String postsIndex(Model vModel){
        vModel.addAttribute("posts", postsvc.findAll());
//        vModel.addAttribute("cats", catsvc.findAll());
        vModel.addAttribute("users", usersvc.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable int id, Model vModel){
        Post thisPost = postsvc.findOne(id);
        vModel.addAttribute("post", thisPost);
        vModel.addAttribute("cats", catsvc.findAll());
        vModel.addAttribute("user", usersvc.findOne(thisPost.getId()));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postCreateForm(Model vModel){
        vModel.addAttribute("post", new Post());
        vModel.addAttribute("cats", catsvc.findAll());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postCreated(@ModelAttribute Post post){
        Post newPost = postsvc.createPost(post);
        newPost.setUser(usersvc.findOne((int)Math.ceil(Math.random()*4)));
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
