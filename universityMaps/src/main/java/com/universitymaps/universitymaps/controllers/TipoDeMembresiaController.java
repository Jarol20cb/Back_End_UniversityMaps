package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.SugerenciaDTO;
import com.universitymaps.universitymaps.dtos.TipoDeMembresiaDTO;
import com.universitymaps.universitymaps.entities.Sugerencia;
import com.universitymaps.universitymaps.entities.TipoDeMembresia;
import com.universitymaps.universitymaps.services.TipoDeMembresiaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresiatipos")
public class TipoDeMembresiaController {
    @Autowired
    private TipoDeMembresiaService tS;
    @PostMapping // sent method
    public void insert(@RequestBody TipoDeMembresiaDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDeMembresia p = m.map(dto,TipoDeMembresia.class); // takes dto and converts it to a Pet class
        tS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<TipoDeMembresiaDTO> list(){
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoDeMembresiaDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        tS.delete(id);
    }
    @GetMapping("/{id}")
    public TipoDeMembresiaDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        TipoDeMembresiaDTO dto=m.map(tS.ListId(id),TipoDeMembresiaDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody TipoDeMembresiaDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDeMembresia p = m.map(dto,TipoDeMembresia.class); // takes dto and converts it to a Pet class
        tS.insert(p);
    }


}
