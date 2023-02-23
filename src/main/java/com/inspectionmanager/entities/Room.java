package com.inspectionmanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "checklistitem_id", nullable = false)
    private CheckListItem checkListItem;
    @OneToMany
    @JoinColumn(name = "photo_id", nullable = false)
    private Photo photo;
}
