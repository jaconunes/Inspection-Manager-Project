package com.inspectionmanager.services.impl;

import com.inspectionmanager.dto.Endereco;
import com.inspectionmanager.entities.Vistoria;
import com.inspectionmanager.repositories.VistoriaRepository;
import com.inspectionmanager.services.ViaCepService;
import com.inspectionmanager.services.VistoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VistoriaServiceImpl implements VistoriaService {

    @Autowired
    private VistoriaRepository vistoriaRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public List<Vistoria> buscarTodos() {
        return vistoriaRepository.findAll();
    }

    @Override
    public Vistoria buscarPorId(Long id) {
        Optional<Vistoria> vistoriaBd = vistoriaRepository.findById(id);
        return vistoriaBd.get();
    }

    @Override
    public void inserir(Vistoria vistoria) {
        vistoriaRepository.save(vistoria);
    }

    @Override
    public void atualizar(Long id, Vistoria vistoria) {
        Optional<Vistoria> vistoriaBd = vistoriaRepository.findById(id);
        if(vistoriaBd.isPresent()){
            vistoriaRepository.save(vistoria);
        }
    }

    @Override
    public void deletar(Long id) {
        vistoriaRepository.deleteById(id);
    }

    public Endereco findAddressByCep(String cep){
        return viaCepService.consultarCep(cep);
    }
}
