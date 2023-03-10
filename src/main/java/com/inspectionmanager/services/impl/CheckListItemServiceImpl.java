package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.CheckListItem;
import com.inspectionmanager.repositories.CheckListItemRepository;
import com.inspectionmanager.services.CheckListItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckListItemServiceImpl implements CheckListItemService {

    @Autowired
    private CheckListItemRepository checkListItemRepository;


    @Override
    public List<CheckListItem> findAll() {
        return checkListItemRepository.findAll();
    }

    @Override
    public CheckListItem findById(Long id) {
        Optional<CheckListItem> checkListItemDb = checkListItemRepository.findById(id);
        return checkListItemDb.get();
    }

    @Override
    public void insert(CheckListItem checkListItem) {
        checkListItemRepository.save(checkListItem);
    }

    @Override
    public void update(Long id, CheckListItem checkListItem) {
        Optional<CheckListItem> checkListItemDb = checkListItemRepository.findById(id);
        if(checkListItemDb.isPresent()){
            checkListItemRepository.save(checkListItem);
        }
    }

    @Override
    public void delete(Long id) {
        checkListItemRepository.deleteById(id);
    }
}
