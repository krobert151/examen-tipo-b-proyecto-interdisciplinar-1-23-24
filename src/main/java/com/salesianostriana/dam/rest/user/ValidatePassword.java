package com.salesianostriana.dam.rest.user;

import com.salesianostriana.dam.rest.user.dto.ChangePasswordRequest;
import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=ValidatePasswordClass.class)
public @interface ValidatePassword {
}
