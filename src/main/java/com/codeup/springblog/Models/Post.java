package com.codeup.springblog.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="posts")
public class Post {
    @Id
    @GeneratedValue
    private int id;

    @Column (nullable=false)
    private String title;

    @Column(nullable=false)
    private String body;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostImages> images;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="posts_categories",
            joinColumns = {@JoinColumn(name="post_id")},
            inverseJoinColumns = {@JoinColumn(name="category_id")}
    )
    private List<Category> categories;

    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post() {
    }

    public Post(String title, String body, User user, List<PostImages> images, List<Category> categories) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.images = images;
        this.categories = categories;
    }

    public Post(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PostImages> getImages() {
        return images;
    }

    public void setImages(List<PostImages> images) {
        this.images = images;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


}
