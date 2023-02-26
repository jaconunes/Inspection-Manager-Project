package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Room;
import com.inspectionmanager.repositories.RoomRepository;
import com.inspectionmanager.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id).get();
    }

    @Override
    public void insert(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void update(Long id, Room room) {
        Optional<Room> roomDb = roomRepository.findById(id);
        if(roomDb.isPresent()){
            roomRepository.save(room);
        }
    }

    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
