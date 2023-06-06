package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.UniversidadDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Universidad;
import com.universitymaps.universitymaps.services.UniversidadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/universidades")
public class UniversidadController {
    @Autowired
    private UniversidadService uS;

    @PostMapping // sent method
    public void insert(@RequestBody UniversidadDTO dto){
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto, Universidad.class); // takes dto and converts it to a Pet class
        uS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<UniversidadDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversidadDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UniversidadDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        UniversidadDTO dto=m.map(uS.ListId(id),UniversidadDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody UniversidadDTO dto){
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto,Universidad.class); // takes dto and converts it to a Pet class
        uS.insert(p);
    }
}
