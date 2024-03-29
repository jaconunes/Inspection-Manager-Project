package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.User;
import com.inspectionmanager.repositories.UserRepository;
import com.inspectionmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserDetails findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public void insert(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(Long id, User user) {
        Optional<User> userBd = userRepository.findById(id);
        if (userBd.isPresent()){
            userRepository.save(user);
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
