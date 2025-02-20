package com.example.schedule3.service;

import com.example.schedule3.entity.User;
import com.example.schedule3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create or Update User
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get User by ID
    @Transactional(readOnly = true)
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Get All Users
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Delete User by ID
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}