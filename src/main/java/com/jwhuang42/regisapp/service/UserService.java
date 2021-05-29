package com.jwhuang42.regisapp.service;

import com.jwhuang42.regisapp.model.User;
import com.jwhuang42.regisapp.repository.UserRepository;
import org.hibernate.annotations.SQLInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepository = userRepo;
    }

    public void storeUserInfo(User user) {
        userRepository.save(user);
    }

    public User getUserGivenUserId(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchFieldError::new);
    }

    public User getUserGivenUserNameAndPassword(String userName, String password) {
        return userRepository.findUserByUserNameAndUserPassword(userName, password).orElseThrow(NoSuchFieldError::new);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
