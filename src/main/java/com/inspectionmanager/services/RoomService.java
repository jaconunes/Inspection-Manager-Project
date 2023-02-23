package com.inspectionmanager.services;

import com.inspectionmanager.entities.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    Room findById(Long id);

    void insert(Room room);

    void update(Long id, Room room);

    void delete(Long id);
}
