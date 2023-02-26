package com.inspectionmanager.controllers;

import com.inspectionmanager.entities.CheckListItem;
import com.inspectionmanager.services.CheckListItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("checklistitems")
public class CheckListItemController {

    @Autowired
    private CheckListItemService checkListItemService;

    @GetMapping
    public ResponseEntity<List<CheckListItem>> findAll(){
        return ResponseEntity.ok(checkListItemService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CheckListItem> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(checkListItemService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CheckListItem> insert(@RequestBody CheckListItem checkListItem){
        checkListItemService.insert(checkListItem);
        return ResponseEntity.ok(checkListItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CheckListItem> update(@PathVariable("id") Long id, @RequestBody CheckListItem checkListItem){
        checkListItemService.update(id, checkListItem);
        return ResponseEntity.ok(checkListItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        checkListItemService.delete(id);
        return ResponseEntity.ok().build();
    }
}
