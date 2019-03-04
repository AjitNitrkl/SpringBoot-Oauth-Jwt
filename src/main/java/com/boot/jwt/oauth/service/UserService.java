package com.boot.jwt.oauth.service;

import java.util.List;

import com.boot.jwt.oauth.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
