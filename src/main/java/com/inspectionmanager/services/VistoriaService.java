package com.inspectionmanager.services;

import com.inspectionmanager.entities.Vistoria;

import java.util.List;

public interface VistoriaService {

    List<Vistoria> buscarTodos();

    Vistoria buscarPorId(Long id);

    void inserir(Vistoria vistoria);

    void atualizar(Long id, Vistoria cliente);

    void deletar(Long id);
}
