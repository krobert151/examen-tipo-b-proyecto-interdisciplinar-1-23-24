package com.salesianostriana.dam.rest.user.dto;

import com.salesianostriana.dam.rest.user.ValidatePassword;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
@ValidatePassword
public class ChangePasswordRequest {
    @NotBlank(message = "No puede estar en blanco")
    private String oldPassword;

    @NotBlank(message = "No puede estar en blanco")
    @Min(value = 8, message = "La contraseña tiene que tener el menos 8 carácteres")
    private String newPassword;

    @NotBlank(message = "No puede estar en blanco")
    private String verifyNewPassword;

}
