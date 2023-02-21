package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Orcamento;
import com.inspectionmanager.repositories.OrcamentoRepository;
import com.inspectionmanager.services.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrcamentoServiceImpl implements OrcamentoService {

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    @Override
    public List<Orcamento> buscarTodos() {
        return orcamentoRepository.findAll();
    }

    @Override
    public Orcamento buscarPorId(Long id) {
        Optional<Orcamento> orcamentoBd = orcamentoRepository.findById(id);
        return orcamentoBd.get();
    }

    @Override
    public void inserir(Orcamento orcamento) {
        orcamentoRepository.save(orcamento);
    }

    @Override
    public void atualizar(Long id, Orcamento orcamento) {
        Optional<Orcamento> orcamentoBd = orcamentoRepository.findById(id);
        if(orcamentoBd.isPresent()){
            orcamentoRepository.save(orcamento);
        }
    }

    @Override
    public void deletar(Long id) {
        orcamentoRepository.deleteById(id);
    }
}
