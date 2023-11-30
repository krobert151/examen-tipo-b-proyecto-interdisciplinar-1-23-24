package com.salesianostriana.dam.rest.ticket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Ticket {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @Column(columnDefinition = "VARCHAR(10000)")
    private String description;

    private LocalDateTime deadline;

}
