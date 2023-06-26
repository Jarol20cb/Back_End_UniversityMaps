package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;

import java.util.List;

public interface DestinyService {
    public void insert(Destiny destiny);
    List<Destiny> list();
    public void delete(int idDestiny);
    public Destiny ListId(int IdDestiny);
}
