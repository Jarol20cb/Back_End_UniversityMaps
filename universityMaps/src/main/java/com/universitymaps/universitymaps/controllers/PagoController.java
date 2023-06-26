package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.*;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Pago;
import com.universitymaps.universitymaps.services.PagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")

public class PagoController {
    @Autowired
    private PagoService pS;
    @PostMapping
    public void insert(@RequestBody PagoDTO dto){
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto,Pago.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PagoDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public PagoDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        PagoDTO dto=m.map(pS.ListId(id),PagoDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody PagoDTO dto){
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto,Pago.class);
        pS.insert(p);
    }
    @GetMapping("/reporte4")
    public List<PagoMembresiaDTO> getCantUsuarioXMmebresia(){
        List<PagoMembresiaDTO> pagoMembresiaDTOS=pS.reporte4();
        return pagoMembresiaDTOS;
    }
    @GetMapping("/reporte7")
    public List<reporte7> getSumaMontoXMetodo(){
        List<reporte7> reporte7s=pS.reporte7();
        return reporte7s;
    }
    @GetMapping("/reporte9")
    public List<reporte9> getSumaMontoXMembresia(){
        List<reporte9> reporte9s=pS.reporte9();
        return reporte9s;
    }
}
