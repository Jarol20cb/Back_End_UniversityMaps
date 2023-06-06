package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.services.DestinyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/destinies")
public class DestinyController {
@Autowired
    private DestinyService dS;
    @PostMapping // sent method
    public void insert(@RequestBody DestinyDTO dto){
        ModelMapper m = new ModelMapper();
        Destiny p = m.map(dto,Destiny.class); // takes dto and converts it to a Pet class
        dS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<DestinyDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DestinyDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public DestinyDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        DestinyDTO dto=m.map(dS.ListId(id),DestinyDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody DestinyDTO dto){
        ModelMapper m = new ModelMapper();
        Destiny p = m.map(dto,Destiny.class); // takes dto and converts it to a Pet class
        dS.insert(p);
    }



}
