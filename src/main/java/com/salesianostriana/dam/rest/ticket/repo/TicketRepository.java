package com.salesianostriana.dam.rest.ticket.repo;

import com.salesianostriana.dam.rest.ticket.GetTicketDto;
import com.salesianostriana.dam.rest.ticket.model.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query("""
            select a from Ticket a
            """)
    Page<Ticket> findAllPageable(Pageable pageable);


    @Query("""
            select new com.salesianostriana.dam.rest.ticket.GetTicketDto(
            t.id, t.title, t.deadline
            ) from Ticket t
            """)
    List<GetTicketDto> findAllGetTicketDto();


}
