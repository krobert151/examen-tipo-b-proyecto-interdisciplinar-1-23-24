package com.salesianostriana.dam.rest.error;

import com.salesianostriana.dam.rest.ticket.error.TiketNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class ErrorController {

    @ExceptionHandler(TiketNotFound.class)
    public ErrorResponse ticketNotFound(){

        return ErrorResponse.builder(new TiketNotFound(),HttpStatus.NOT_FOUND, "Ticket Not Found" )
                .title("Ticket Not found")
                .build();

    }

}
