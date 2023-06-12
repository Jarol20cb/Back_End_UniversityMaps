package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Ubicacion;
import com.universitymaps.universitymaps.repositories.UbicacionRepository;
import com.universitymaps.universitymaps.services.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UbicacionServiceImplement implements UbicacionService {
    @Autowired
    private UbicacionRepository uuuR;
    @Override
    public void insert(Ubicacion ubicacion) {
        uuuR.save(ubicacion);

    }

    @Override
    public List<Ubicacion> list() {
        return uuuR.findAll();
    }

    @Override
    public void delete(int idUbicacion) {
uuuR.deleteById(idUbicacion);
    }

    @Override
    public Ubicacion ListId(int IdUbicacion) {
        return uuuR.findById(IdUbicacion).orElse(new Ubicacion());
    }
}
