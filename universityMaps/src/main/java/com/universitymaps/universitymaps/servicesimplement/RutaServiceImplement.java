package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Ruta;
import com.universitymaps.universitymaps.repositories.RutaRepository;
import com.universitymaps.universitymaps.services.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RutaServiceImplement implements RutaService {
    @Autowired
    private RutaRepository rR;
    @Override
    public void insert(Ruta ruta) {
        rR.save(ruta);
    }

    @Override
    public List<Ruta> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRuta) {
rR.deleteById(idRuta);
    }

    @Override
    public Ruta ListId(int IdRuta) {
        return rR.findById(IdRuta).orElse(new Ruta());
    }
}
