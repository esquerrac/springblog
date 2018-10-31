package com.codeup.springblog.services;

import com.codeup.springblog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostSvc {
    private List<Post> posts;


    public PostSvc(){
        posts=new ArrayList<>();
        createPosts();
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post findOne(int id){
        return posts.get(id - 1);
    }

    public Post save (Post post){
        post.setId(posts.size()+1);
        posts.add(post);
        return post;
    }

    private void createPosts(){
        this.save(new Post("Test Post", "Should work"));
        this.save(new Post("Another Post", "Should also work"));
        this.save(new Post("I need more", "Posts to test out"));

    }
}
