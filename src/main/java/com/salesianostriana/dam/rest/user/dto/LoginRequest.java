package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    @NotBlank(message = "No puede estar en blanco")
    private String username;

    @NotBlank(message = "No puede estar en blanco")
    private String password;

}
