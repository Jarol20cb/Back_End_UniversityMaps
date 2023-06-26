package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.services.DestinyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/destinos")
public class DestinyController {
@Autowired
    private DestinyService dS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody DestinyDTO dto){
        ModelMapper m = new ModelMapper();
        Destiny p = m.map(dto,Destiny.class);
        dS.insert(p);
    }
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN, ALUMNO, PROFESOR')")
    public List<DestinyDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DestinyDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable ("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public DestinyDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        DestinyDTO dto=m.map(dS.ListId(id),DestinyDTO.class);
        return dto;
    }
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody DestinyDTO dto){
        ModelMapper m = new ModelMapper();
        Destiny p = m.map(dto,Destiny.class);
        dS.insert(p);
    }
}
