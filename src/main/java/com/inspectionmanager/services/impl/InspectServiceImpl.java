package com.inspectionmanager.services.impl;

import com.inspectionmanager.dto.Address;
import com.inspectionmanager.entities.Inspect;
import com.inspectionmanager.repositories.InspectRepository;
import com.inspectionmanager.services.ViaCepService;
import com.inspectionmanager.services.InspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InspectServiceImpl implements InspectService {

    @Autowired
    private InspectRepository inspectRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public List<Inspect> findAll() {
        return inspectRepository.findAll();
    }

    @Override
    public Inspect findById(Long id) {
        Optional<Inspect> vistoriaBd = inspectRepository.findById(id);
        return vistoriaBd.get();
    }

    @Override
    public void insert(Inspect vistoria) {
        inspectRepository.save(vistoria);
    }

    @Override
    public void update(Long id, Inspect vistoria) {
        Optional<Inspect> inspectBd = inspectRepository.findById(id);
        if(inspectBd.isPresent()){
            inspectRepository.save(vistoria);
        }
    }

    @Override
    public void delete(Long id) {
        inspectRepository.deleteById(id);
    }

    public Address findAddressByCep(String cep){
        return viaCepService.consultarCep(cep);
    }
}
