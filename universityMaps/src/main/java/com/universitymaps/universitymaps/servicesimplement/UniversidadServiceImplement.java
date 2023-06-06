package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Universidad;
import com.universitymaps.universitymaps.repositories.UniversidadRepository;
import com.universitymaps.universitymaps.services.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversidadServiceImplement implements UniversidadService {
    @Autowired
    private UniversidadRepository uR;
    @Override
    public void insert(Universidad universidad) {
uR.save(universidad);
    }

    @Override
    public List<Universidad> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUniversidad) {
uR.deleteById(idUniversidad);
    }

    @Override
    public Universidad ListId(int IdUniversidad) {
        return uR.findById(IdUniversidad).orElse(new Universidad());
    }


}
