package com.example.schedule3.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class UserDto {

    @NotNull
    @Size(message = "이름은 2글자 이상 10글자 이하로 해야합니다",max = 10, min = 4)
    private String username;

    @Email(message = "올바른 이메일 형식이 아님니다.")
    private String email;

}