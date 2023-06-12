package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.UsuarioDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Usuario;
import com.universitymaps.universitymaps.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService uuS;
    @PostMapping // sent method
    public void insert(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario p = m.map(dto,Usuario.class); // takes dto and converts it to a Pet class
        uuS.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<UsuarioDTO> list(){
        return uuS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        uuS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uuS.ListId(id),UsuarioDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario p = m.map(dto,Usuario.class); // takes dto and converts it to a Pet class
        uuS.insert(p);
    }
}
