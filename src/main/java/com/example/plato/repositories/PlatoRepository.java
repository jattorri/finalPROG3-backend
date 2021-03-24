package com.example.plato.repositories;

import com.example.plato.entities.Plato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatoRepository extends BaseRepository <Plato,Long> {
    @Query(value = "SELECT p FROM Plato p WHERE p.nombre LIKE %:filtro% OR p.rubro LIKE %:filtro%")
    List <Plato> search(@Param("filtro")String filtro);
}
