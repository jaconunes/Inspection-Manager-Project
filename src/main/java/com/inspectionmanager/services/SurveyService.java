package com.inspectionmanager.services;

import com.inspectionmanager.entities.Survey;

import java.util.List;

public interface SurveyService {

    List<Survey> findAll();

    Survey findById(Long id);

    void insert(Survey vistoria);

    void update(Long id, Survey cliente);

    void delete(Long id);
}
