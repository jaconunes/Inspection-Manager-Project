package com.inspectionmanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TOWNER")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String personType;

    private String cpfCnpj;

    private String address;

    private Integer number;

    private String neighborhood;

    private String city;

    private String email;

    private String phone;

}
