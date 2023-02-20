package com.inspectionmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Vistoria {

    @Id
    private UUID id;
    private LocalDateTime data;
    private String tipo;


}
