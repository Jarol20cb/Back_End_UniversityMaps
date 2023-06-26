package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Sugerencia;
import com.universitymaps.universitymaps.repositories.SugerenciaRepository;
import com.universitymaps.universitymaps.services.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SugerenciaServiceImplement implements SugerenciaService {
    @Autowired
    private SugerenciaRepository sR;
    @Override
    public void insert(Sugerencia sugerencia) {
        sR.save(sugerencia);
    }

    @Override
    public List<Sugerencia> list() {
        return sR.findAll();
    }


    @Override
    public void delete(int idSugerencia) {
sR.deleteById(idSugerencia);
    }

    @Override
    public Sugerencia ListId(int IdSugerencia) {
        return sR.findById(IdSugerencia).orElse(new Sugerencia());
    }


}
