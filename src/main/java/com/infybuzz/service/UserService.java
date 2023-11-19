package com.infybuzz.service;

import com.infybuzz.entity.User;
import com.infybuzz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getStudentByNameAndPassword(String name, String password) {
        return userRepository.getByNameAndPassword(name, password);
    }
}
