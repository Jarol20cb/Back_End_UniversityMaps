package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Ubicacion;

import java.util.List;

public interface UbicacionService {
    public void insert(Ubicacion ubicacion);
    List<Ubicacion> list();
    public void delete(int idUbicacion);
    public Ubicacion ListId(int IdUbicacion);
}
