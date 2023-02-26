package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Room;
import com.inspectionmanager.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room>> findAll(){
        return ResponseEntity.ok(roomService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(roomService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Room> insert(@RequestBody Room room){
        roomService.insert(room);
        return ResponseEntity.ok(room);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> update(@PathVariable("id") Long id, @RequestBody Room room){
        roomService.update(id, room);
        return ResponseEntity.ok(room);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        roomService.delete(id);
        return ResponseEntity.ok().build();
    }
}
