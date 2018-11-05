package com.codeup.springblog.services;

import com.codeup.springblog.Models.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class CatSvc {
    private CategoriesRepo catRepo;


    public CatSvc(CategoriesRepo catRepo) {
        this.catRepo = catRepo;
    }

    public Iterable<Category> findAll() {
        return catRepo.findAll();
    }

    public Category findOne(int id) {
        return catRepo.findOne(id);
    }

    public Category registerUser(Category cat) {
        return catRepo.save(cat);
    }

    public Category editUser(Category cat) {
        return catRepo.save(cat);
    }

    public void deleteUser(Category cat) {
        catRepo.delete(cat);
    }
//    public Iterable<Category> searchByCat (int id){
//        return catRepo.findAllWithCat(id);
//    }
}
