package com.example.plato.services;

import com.example.plato.entities.Plato;

import java.util.List;

public interface PlatoService extends BaseService<Plato,Long> {
    List<Plato> search(String filtro) throws Exception;
}
