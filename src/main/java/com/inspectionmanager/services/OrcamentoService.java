package com.inspectionmanager.services;

import com.inspectionmanager.entities.Orcamento;

import java.util.List;

public interface OrcamentoService {

    List<Orcamento> buscarTodos();

    Orcamento buscarPorId(Long id);

    void inserir(Orcamento orcamento);

    void atualizar(Long id, Orcamento orcamento);

    void deletar(Long id);
}
