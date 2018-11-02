package com.codeup.springblog.services;

import com.codeup.springblog.Post;
import com.codeup.springblog.PostsRepo;
import org.springframework.stereotype.Service;

@Service
public class PostSvc{
    private PostsRepo postsRepo;


    public PostSvc(PostsRepo postsRepo){
        this.postsRepo = postsRepo;
    }

    public Iterable<Post> findAll() {
        return postsRepo.findAll();
    }

    public Post findOne(int id){
        return postsRepo.findOne(id);
    }

    public Post createPost (Post post){
        return postsRepo.save(post);
    }

    public Post updatePost (Post post){
        return postsRepo.save(post);
    }
    public void deletePost (Post post){
        postsRepo.delete(post);
    }
}
