package com.universitymaps.universitymaps.controllers;


import com.universitymaps.universitymaps.dtos.UsuarioDTO;
import com.universitymaps.universitymaps.dtos.UsuarioUniversidadDTO;
import com.universitymaps.universitymaps.dtos.reporte6;
import com.universitymaps.universitymaps.dtos.reporte8;
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
    @PostMapping
    public void insert(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario p = m.map(dto,Usuario.class);
        uuS.insert(p);
    }
    @GetMapping
    public List<UsuarioDTO> list(){
        return uuS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
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
    @PutMapping
    public void goUpdate(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario p = m.map(dto,Usuario.class);
        uuS.insert(p);
    }

    @GetMapping("/nombres")
    public List<UsuarioUniversidadDTO> getUsuarioByUniversidad(){
        List<UsuarioUniversidadDTO> usuarioUniversidadDTOS=uuS.reporte1();
        return usuarioUniversidadDTOS;
    }
    @GetMapping("/reporte6")
    public List<reporte6> getDestinoMasSelec(){
        List<reporte6> reporte6s=uuS.reporte6();
        return reporte6s;
    }
    @GetMapping("/reporte8")
    public List<reporte8> getNameUsuUbiFav(){
        List<reporte8> reporte8s=uuS.reporte8();
        return reporte8s;
    }
}
