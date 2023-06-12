package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Profesor;

import java.util.List;

public interface ProfesorService {
    public void insert(Profesor profesor);
    List<Profesor> list();
    public void delete(int idProfesor);
    public Profesor ListId(int IdProfesor);
}
