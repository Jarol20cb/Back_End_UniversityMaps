package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.ProfesorDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Profesor;
import com.universitymaps.universitymaps.services.ProfesorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService ppS;
    @PostMapping // sent method
    public void insert(@RequestBody ProfesorDTO dto){
        ModelMapper m = new ModelMapper();
        Profesor p = m.map(dto,Profesor.class); // takes dto and converts it to a Pet class
        ppS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<ProfesorDTO> list(){
        return ppS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ProfesorDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        ppS.delete(id);
    }
    @GetMapping("/{id}")
    public ProfesorDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        ProfesorDTO dto=m.map(ppS.ListId(id),ProfesorDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody ProfesorDTO dto){
        ModelMapper m = new ModelMapper();
        Profesor p = m.map(dto,Profesor.class); // takes dto and converts it to a Pet class
        ppS.insert(p);
    }

}
