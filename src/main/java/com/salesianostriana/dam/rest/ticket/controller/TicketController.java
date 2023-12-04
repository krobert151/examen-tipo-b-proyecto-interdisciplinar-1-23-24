package com.salesianostriana.dam.rest.ticket.controller;

import com.salesianostriana.dam.rest.ticket.GetTicketDto;
import com.salesianostriana.dam.rest.ticket.model.Ticket;
import com.salesianostriana.dam.rest.ticket.repo.TicketRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {

    private final TicketRepository ticketRepository;

    @GetMapping("/")
    public ResponseEntity<List<Ticket>> getAll() {
        List<Ticket> result = ticketRepository.findAll();
        if (result.isEmpty()) {
            throw new EntityNotFoundException("No se ha podido encontrar el ticker");
        }
        return ResponseEntity.ok(result);

    }


    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getById(@PathVariable Long id) {
        Optional<Ticket> result = ticketRepository.findById(id);
        if (result.isEmpty()) {
            throw new EntityNotFoundException("No se ha podido encontrar el ticker con el id"+id);
        }
        return ResponseEntity.ok(result.get());

    }

    @GetMapping("/dto")
    public ResponseEntity<List<GetTicketDto>> getAllDto() {
        return null; // Modificar
    }


}
