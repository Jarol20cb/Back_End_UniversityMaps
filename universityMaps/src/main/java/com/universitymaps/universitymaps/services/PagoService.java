package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.dtos.PagoMembresiaDTO;
import com.universitymaps.universitymaps.dtos.reporte7;
import com.universitymaps.universitymaps.dtos.reporte9;
import com.universitymaps.universitymaps.dtos.UniversidadProfesorDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Pago;

import java.util.List;

public interface PagoService {
    public void insert(Pago pago);
    List<Pago> list();
    public void delete(int idPago);
    public Pago ListId(int IdPago);
    public List<PagoMembresiaDTO> reporte4();
    public List<reporte7> reporte7();
    public List<reporte9> reporte9();
}
