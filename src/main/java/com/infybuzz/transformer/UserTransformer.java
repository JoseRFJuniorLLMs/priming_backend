package com.infybuzz.transformer;

import com.infybuzz.entity.User;
import com.infybuzz.DTO.UserDTO;

public class UserTransformer {

    public UserDTO toDto(User user) {
        UserDTO userDto = new UserDTO();
        userDto.setId(user.getId());
        userDto.setCpf(user.getCpf());
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setPhone(user.getPhone());
        return userDto;
    }

    public User toEntity(UserDTO userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setCpf(userDto.getCpf());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPhone(userDto.getPhone());
        return user;
    }
}