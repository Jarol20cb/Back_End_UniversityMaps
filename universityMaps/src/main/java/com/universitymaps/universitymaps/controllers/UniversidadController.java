package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.Reporte3;
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

    @PostMapping
    public void insert(@RequestBody UniversidadDTO dto){
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto, Universidad.class);
        uS.insert(p);
    }
    @GetMapping
    public List<UniversidadDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversidadDTO.class);
        }).collect(Collectors.toList());
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
    @PutMapping
    public void goUpdate(@RequestBody UniversidadDTO dto){
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto,Universidad.class);
        uS.insert(p);
    }
    @GetMapping("/reporte3")
    public List<Reporte3> getUniversityLima(){
        List<Reporte3> reporte3s=uS.reporte3();
        return reporte3s;
    }
}
