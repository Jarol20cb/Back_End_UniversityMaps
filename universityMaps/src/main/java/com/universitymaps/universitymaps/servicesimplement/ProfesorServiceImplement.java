package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Profesor;
import com.universitymaps.universitymaps.repositories.ProfesorRepository;
import com.universitymaps.universitymaps.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProfesorServiceImplement implements ProfesorService {
    @Autowired
    private ProfesorRepository ppR;
    @Override
    public void insert(Profesor profesor) {
        ppR.save(profesor);
    }

    @Override
    public List<Profesor> list() {
        return ppR.findAll();
    }

    @Override
    public void delete(int idProfesor) {
ppR.deleteById(idProfesor);
    }

    @Override
    public Profesor ListId(int IdProfesor) {
        return ppR.findById(IdProfesor).orElse(new Profesor());
    }
}
