package com.codeup.springblog.services;

import com.codeup.springblog.Models.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepo extends CrudRepository<Category, Integer> {

//    @Query(value = "from posts as p " +
//            "join posts_categories as p_c on p.id = p_c.post_id " +
//            "join categories as c  on c.id = p_c.category_id " +
//            "where p_c.category_id =%1%")
//    Iterable<Category> findAllWithCat(int cat_id);
}
