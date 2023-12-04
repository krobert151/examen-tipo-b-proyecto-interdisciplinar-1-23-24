package com.salesianostriana.dam.rest.ticket.error;

import jakarta.persistence.EntityNotFoundException;

public class TiketNotFound extends EntityNotFoundException {
    public TiketNotFound() {
        super();
    }

    public TiketNotFound(String message) {
        super(message);
    }
}
