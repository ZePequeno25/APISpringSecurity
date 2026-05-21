package com.example.demo.dto;

import com.example.demo.enums.RoleName;

public record CreateUserDto(
        String email,
        String password,
        RoleName role
) {
}
