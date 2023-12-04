package com.salesianostriana.dam.rest.user;

import com.salesianostriana.dam.rest.user.dto.ChangePasswordRequest;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ValidatePasswordClass implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(ChangePasswordRequest.class);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        if(!changePasswordRequest.getNewPassword().equals(changePasswordRequest.getOldPassword())){
            errors.rejectValue("NewPassword","Las contraseñas son iguales");
        }

    }
}
