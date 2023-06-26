package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.UbicacionFav;

import java.util.List;

public interface UbicacionFavService {
    public void insert(UbicacionFav ubicacionFav);
    List<UbicacionFav> list();
    public void delete(int idUbicacionesFav);
    public UbicacionFav ListId(int IdUbicacionesFav);
}
