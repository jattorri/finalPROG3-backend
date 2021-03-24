package com.example.plato.services;

import com.example.plato.entities.Plato;
import com.example.plato.repositories.BaseRepository;
import com.example.plato.repositories.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoServiceImpl extends BaseServiceImpl<Plato,Long> implements PlatoService {
    @Autowired
    private PlatoRepository platoRepository;

    public PlatoServiceImpl(BaseRepository<Plato, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Plato> search(String filtro) throws Exception {
        try{
            List <Plato> platos = platoRepository.search(filtro);
            return platos;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
