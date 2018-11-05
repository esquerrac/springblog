package com.codeup.springblog.services;

import com.codeup.springblog.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<User, Integer> {

    User findByUsername(String username) ;

}
