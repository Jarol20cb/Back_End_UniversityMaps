package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.UbicacionFav;
import com.universitymaps.universitymaps.repositories.UbicacionRepository;
import com.universitymaps.universitymaps.repositories.UbicacionesFavRepository;
import com.universitymaps.universitymaps.services.UbicacionFavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UbicacionesFavServiceImplement implements UbicacionFavService {
    @Autowired
    private UbicacionesFavRepository fR;
    @Override
    public void insert(UbicacionFav ubicacionFav) {
        fR.save(ubicacionFav);

    }

    @Override
    public List<UbicacionFav> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int idUbicacionesFav) {
fR.deleteById(idUbicacionesFav);
    }

    @Override
    public UbicacionFav ListId(int IdUbicacionesFav) {
        return fR.findById(IdUbicacionesFav).orElse(new UbicacionFav());
    }
}
