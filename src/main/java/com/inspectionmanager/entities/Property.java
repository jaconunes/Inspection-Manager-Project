package com.inspectionmanager.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String propertyType;

    private Integer roomsCount;

    private Date registrationDate;

    private String address;

    private Integer number;

    private String neighborhood;

    private String city;

    @ManyToOne
    @JoinColumn(name = "OWNER_ID", nullable = false)
    private Long ownerId;

}
