package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Pago;
import com.universitymaps.universitymaps.repositories.PagoRepository;
import com.universitymaps.universitymaps.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PagoServiceImplement implements PagoService {
    @Autowired
    private PagoRepository pR;
    @Override
    public void insert(Pago pago) {
        pR.save(pago);
    }

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPago) {
pR.deleteById(idPago);
    }

    @Override
    public Pago ListId(int IdPago) {
        return pR.findById(IdPago).orElse(new Pago());
    }
}
