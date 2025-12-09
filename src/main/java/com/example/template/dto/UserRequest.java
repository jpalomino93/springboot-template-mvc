package com.example.template.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequest {
 @NotBlank(message="El nombre es obligatorio")
 private String name;
 @NotBlank(message="El email es obligatorio")
 @Email(message="Formato inválido")
 private String email;
}