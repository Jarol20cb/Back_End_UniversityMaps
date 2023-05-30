package com.universitymaps.tipomembresiaum.servicesimplement;

import com.universitymaps.tipomembresiaum.entities.Membresia;
import com.universitymaps.tipomembresiaum.repositories.IPMembresiaRepository;
import com.universitymaps.tipomembresiaum.services.IPMembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MembresiaServiceImplement implements IPMembresiaService {
    @Autowired
    private IPMembresiaRepository Mt;

    @Override
    public void insert(Membresia membresia) {
        Mt.save(membresia);

    }

    @Override
    public List<Membresia> list() {
        return Mt.findAll();
    }

    @Override
    public void delete(int idMembresia) {
        Mt.deleteById(idMembresia);

    }

    @Override
    public Membresia ListId(int idMembresia) {
        return Mt.findById(idMembresia).orElse(new Membresia());
    }
}
