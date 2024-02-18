package com.acctuator.test.suit.springboot_vulnerable_acctuators.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acctuator.test.suit.springboot_vulnerable_acctuators.entity.User;
import com.acctuator.test.suit.springboot_vulnerable_acctuators.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // public User getUserById(Long id) {
    //     return userRepository.findById(id).orElse(null);
    // }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    // public void deleteUser(Long id) {
    //     userRepository.deleteById(id);
    // }
}

