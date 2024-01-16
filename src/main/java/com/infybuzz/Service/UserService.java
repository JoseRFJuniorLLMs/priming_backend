package com.infybuzz.Service;

import com.infybuzz.DTO.UserDTO;
import com.infybuzz.Entity.User;
import com.infybuzz.Repository.UserRepository;
import com.infybuzz.DTO.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private final UserTransformer userTransformer = new UserTransformer();

    public UserDTO getUserById(Integer id) {
        User user = userRepository.findById(Long.valueOf(id)).get();
        return userTransformer.toDto(user);
    }

    public User saveUser(User user) {
        user = userRepository.createUser(user.getName(), user.getPassword(), user.getEmail(), user.getPhone(), user.getCpf());
        return user;
    }
}
