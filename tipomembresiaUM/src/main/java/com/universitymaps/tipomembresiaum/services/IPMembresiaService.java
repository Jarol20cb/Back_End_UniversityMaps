package com.universitymaps.tipomembresiaum.services;

import com.universitymaps.tipomembresiaum.entities.Membresia;

import java.util.List;

public interface IPMembresiaService {
    public void insert(Membresia membresia);

    List<Membresia>list();
    public void delete(int idMembresia);

    public Membresia ListId(int idMembresia);
}
