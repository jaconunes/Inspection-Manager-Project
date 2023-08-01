package com.inspectionmanager.services;

import com.inspectionmanager.entities.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    UserDetails findByUserName(String userName);

    void insert(User user);

    void update(Long id, User user);

    void delete(Long id);
}
