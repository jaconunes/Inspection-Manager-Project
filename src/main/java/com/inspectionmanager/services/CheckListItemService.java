package com.inspectionmanager.services;

import com.inspectionmanager.entities.CheckListItem;

import java.util.List;

public interface CheckListItemService {

    List<CheckListItem> findAll();

    CheckListItem findById(Long id);

    void insert(CheckListItem checkListItem);

    void update(Long id, CheckListItem checkListItem);

    void delete(Long id);
}
