package com.inspectionmanager.services.impl;

import com.inspectionmanager.dto.Address;
import com.inspectionmanager.entities.Survey;
import com.inspectionmanager.repositories.SurveyRepository;
import com.inspectionmanager.services.ViaCepService;
import com.inspectionmanager.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepository vistoriaRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public List<Survey> findAll() {
        return vistoriaRepository.findAll();
    }

    @Override
    public Survey findById(Long id) {
        Optional<Survey> vistoriaBd = vistoriaRepository.findById(id);
        return vistoriaBd.get();
    }

    @Override
    public void insert(Survey vistoria) {
        vistoriaRepository.save(vistoria);
    }

    @Override
    public void update(Long id, Survey vistoria) {
        Optional<Survey> vistoriaBd = vistoriaRepository.findById(id);
        if(vistoriaBd.isPresent()){
            vistoriaRepository.save(vistoria);
        }
    }

    @Override
    public void delete(Long id) {
        vistoriaRepository.deleteById(id);
    }

    public Address findAddressByCep(String cep){
        return viaCepService.consultarCep(cep);
    }
}
