package com.inspectionmanager.services;

import com.inspectionmanager.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void insert(User user);

    void update(Long id, User user);

    void delete(Long id);
}
