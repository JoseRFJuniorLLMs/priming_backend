package com.infybuzz.controller;

import com.infybuzz.entity.User;
import com.infybuzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUserLogin/{name}/{password}")
    public List<User> getStudentByNameAndPassword(@PathVariable String name,
                                                   @PathVariable String password) {
        return userService.getStudentByNameAndPassword(name, password);
    }



}
