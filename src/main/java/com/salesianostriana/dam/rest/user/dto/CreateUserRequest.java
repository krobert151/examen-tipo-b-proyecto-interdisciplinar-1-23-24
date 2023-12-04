package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank(message = "No puede estar en blanco")
    private String username;

    @NotBlank(message = "No puede estar en blanco")
    @Min(value = 8, message = "La contraseña tiene que tener el menos 8 carácteres")
    private String password;

    private String verifyPassword;
    private String avatar;
    private String fullName;

    @Email(message = "El email tiene que ser un email")
    private String email;

}
