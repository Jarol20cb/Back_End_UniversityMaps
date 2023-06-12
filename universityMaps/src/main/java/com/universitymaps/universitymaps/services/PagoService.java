package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Pago;

import java.util.List;

public interface PagoService {
    public void insert(Pago pago);
    List<Pago> list();
    public void delete(int idPago);
    public Pago ListId(int IdPago);

}
