package com.example.schedule3.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    @NotNull
    @Size(max = 10)
    private String username;

    @Email
    private String email;

    // Getters and Setters
}