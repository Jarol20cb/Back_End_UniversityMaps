package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.RutaDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Ruta;
import com.universitymaps.universitymaps.services.RutaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutas")
public class RutaController {
    @Autowired
    private RutaService rS;
    @PostMapping // sent method
    public void insert(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta p = m.map(dto,Ruta.class); // takes dto and converts it to a Pet class
        rS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<RutaDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RutaDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RutaDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        RutaDTO dto=m.map(rS.ListId(id),RutaDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta p = m.map(dto,Ruta.class); // takes dto and converts it to a Pet class
        rS.insert(p);
    }

}
