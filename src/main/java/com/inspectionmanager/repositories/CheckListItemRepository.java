package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.CheckListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListItemRepository extends JpaRepository<CheckListItem, Long> {
}
