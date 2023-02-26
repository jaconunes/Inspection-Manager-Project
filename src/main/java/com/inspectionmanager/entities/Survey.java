package com.inspectionmanager.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String type;
    private Integer propertyId;
    private String cep;
    private String street;
    private String number;
    private String complement;
    private String neighbor;
    private String condominium;
    private String locatorName;
    private String renterName;
    private Date departureDate;
    private String finalremarks;
    private Long eletricityReading;
    private Long waterReading;
    @OneToMany
    @JoinColumn(name = "room_id", nullable = false)
    private List<Room> rooms;
    @OneToMany
    @JoinColumn(name = "estimate_id", nullable = false)
    private List<Estimate> estimates;



}
