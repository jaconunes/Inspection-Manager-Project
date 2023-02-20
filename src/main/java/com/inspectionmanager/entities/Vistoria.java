package com.inspectionmanager.entities;

import com.inspectionmanager.dto.Endereco;
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
    private Integer codigoImovel;
    private Endereco endereco;


}
