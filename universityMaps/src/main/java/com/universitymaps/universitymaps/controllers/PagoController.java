package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.PagoDTO;
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
    @PostMapping // sent method
    public void insert(@RequestBody PagoDTO dto){
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto,Pago.class); // takes dto and converts it to a Pet class
        pS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<PagoDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PagoDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
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
        Pago p = m.map(dto,Pago.class); // takes dto and converts it to a Pet class
        pS.insert(p);
    }
}
