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


    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }


    @Transactional(readOnly = true)
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Transactional
    public void deleteUser(Long id) {
       userRepository.deleteById(id);
    }
}