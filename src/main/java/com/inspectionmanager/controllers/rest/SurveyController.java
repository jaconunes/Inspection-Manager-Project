package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Survey;
import com.inspectionmanager.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping
    public ResponseEntity<List<Survey>> findAll(){
        return ResponseEntity.ok(surveyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Survey> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(surveyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Survey> insert(@RequestBody Survey survey){
        surveyService.insert(survey);
        return ResponseEntity.ok(survey);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Survey> update(@PathVariable("id") Long id, @RequestBody Survey survey){
        surveyService.update(id, survey);
        return ResponseEntity.ok(survey);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        surveyService.delete(id);
        return ResponseEntity.ok().build();
    }
}
