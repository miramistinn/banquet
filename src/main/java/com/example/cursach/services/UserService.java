package com.example.cursach.services;

import com.example.cursach.dto.UserDTO;
import com.example.cursach.entity.User;
import com.example.cursach.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createAdmin(UserDTO dto) {
        System.out.println(dto.getEmail() +"   "+ dto.getPassword());
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .role("admin")
                .build());

    }
    public User createUser(UserDTO dto) {
        System.out.println(dto.getEmail() +"   "+ dto.getPassword());
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .role("user")
                .build());

    }
}
