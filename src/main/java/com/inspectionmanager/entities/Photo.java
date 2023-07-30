package com.inspectionmanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    private String path;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID", nullable = false)
    private Long roomId;

}
