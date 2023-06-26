package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.TipoDeMembresia;
import com.universitymaps.universitymaps.repositories.TipoDeMembresiaRepository;
import com.universitymaps.universitymaps.services.TipoDeMembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoDeMembresiaServiceImplement implements TipoDeMembresiaService {
    @Autowired
    private TipoDeMembresiaRepository tR;
    @Override
    public void insert(TipoDeMembresia tipoDeMembresia) {
tR.save(tipoDeMembresia);
    }

    @Override
    public List<TipoDeMembresia> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTipodemembresia) {
tR.deleteById(idTipodemembresia);
    }

    @Override
    public TipoDeMembresia ListId(int IdTipodemembresia) {
        return tR.findById(IdTipodemembresia).orElse(new TipoDeMembresia());
    }
}
