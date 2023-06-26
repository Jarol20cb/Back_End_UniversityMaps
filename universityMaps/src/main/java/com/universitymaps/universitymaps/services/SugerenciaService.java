package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Sugerencia;

import java.util.List;

public interface SugerenciaService {
    public void insert(Sugerencia sugerencia);
    List<Sugerencia> list();
    public void delete(int idSugerencia);
    public Sugerencia ListId(int IdSugerencia);
}
