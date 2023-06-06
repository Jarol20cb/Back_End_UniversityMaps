package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.SugerenciaDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Sugerencia;
import com.universitymaps.universitymaps.services.SugerenciaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sugerencias")
public class SugerenciaController {
    @Autowired
    private SugerenciaService sS;
    @PostMapping // sent method
    public void insert(@RequestBody SugerenciaDTO dto){
        ModelMapper m = new ModelMapper();
        Sugerencia p = m.map(dto,Sugerencia.class); // takes dto and converts it to a Pet class
        sS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<SugerenciaDTO> list(){
        return sS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, SugerenciaDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public SugerenciaDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        SugerenciaDTO dto=m.map(sS.ListId(id),SugerenciaDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody SugerenciaDTO dto){
        ModelMapper m = new ModelMapper();
        Sugerencia p = m.map(dto,Sugerencia.class); // takes dto and converts it to a Pet class
        sS.insert(p);
    }

}
