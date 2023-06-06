package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Universidad;

import java.util.List;

public interface UniversidadService {

    public void insert(Universidad universidad);

    List<Universidad> list();

    public void delete(int idUniversidad);

    public Universidad ListId(int IdUniversidad);
}
