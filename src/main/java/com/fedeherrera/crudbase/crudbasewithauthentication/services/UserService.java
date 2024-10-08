package com.fedeherrera.crudbase.crudbasewithauthentication.services;

import java.util.List;

import com.fedeherrera.crudbase.crudbasewithauthentication.entities.User;

public interface UserService {
    
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
