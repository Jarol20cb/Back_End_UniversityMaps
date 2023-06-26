package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.dtos.*;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Pago;
import com.universitymaps.universitymaps.repositories.PagoRepository;
import com.universitymaps.universitymaps.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public List<PagoMembresiaDTO> reporte4() {
        List<String[]> usuarioXmembresia=pR.getCantUsuarioXMmebresia();
        List<PagoMembresiaDTO> pagoMembresiaDTOS=new ArrayList<>();

        for (String[] data:usuarioXmembresia){
            PagoMembresiaDTO dto=new PagoMembresiaDTO();
            dto.setDescripcionMembresia(data[0]);
            dto.setContadorUsuarios(Integer.parseInt(data[1]));
            pagoMembresiaDTOS.add(dto);
        }
        return pagoMembresiaDTOS;
    }

    @Override
    public List<reporte7> reporte7() {
        List<String[]> pago=pR.getSumaMontoXMetodo();
        List<reporte7> reporte7s=new ArrayList<>();

        for (String[] data:pago){
            reporte7 dto=new reporte7();
            dto.setMetodoPago(data[0]);
            dto.setSumaMonto(Integer.parseInt(data[1]));
            reporte7s.add(dto);
        }
        return reporte7s;
    }

    @Override
    public List<reporte9> reporte9() {
        List<String[]> membresia=pR.getSumaMontoXMembresia();
        List<reporte9> reporte9s=new ArrayList<>();

        for (String[] data:membresia){
            reporte9 dto=new reporte9();
            dto.setDescripcionMembresia(data[0]);
            dto.setSumaMonto(Integer.parseInt(data[1]));
            reporte9s.add(dto);
        }
        return reporte9s;
    }
}
