package com.inspectionmanager.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime date;
    private String type;
    private Integer propertyId;
    private String street;
    private String number;
    private String complement;
    private String neighbor;
    private String condominium;
    private String locatorName;
    private String renterName;
    @OneToMany
    @JoinColumn(name = "orcamento_id", nullable = false)
    private Estimate estimate;


}
