package com.codeup.springblog.Models;

import javax.persistence.*;

@Entity
public class PostImages {

    @Id
    @GeneratedValue
    private int id;

    @Column (nullable=false)
    private String image;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;




    public PostImages() {
    }

    public PostImages(int id, String image, Post post) {
        this.id = id;
        this.image = image;
        this.post = post;
    }

    public PostImages(String image, Post post) {
        this.image = image;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
