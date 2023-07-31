package com.inspectionmanager.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TCUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String corporateName;

    private String cnpj;

    private String address;

    private Integer number;

    private String neighborhood;

    private String city;

    private String email;

    private String phone;

}
