package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Ruta;

import java.util.List;

public interface RutaService {
    public void insert(Ruta ruta);
    List<Ruta> list();
    public void delete(int idRuta);
    public Ruta ListId(int IdRuta);
}
