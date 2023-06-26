package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.TipoDeMembresia;

import java.util.List;

public interface TipoDeMembresiaService {
    public void insert(TipoDeMembresia tipoDeMembresia);
    List<TipoDeMembresia> list();
    public void delete(int idTipodemembresia);
    public TipoDeMembresia ListId(int IdTipodemembresia);
}
