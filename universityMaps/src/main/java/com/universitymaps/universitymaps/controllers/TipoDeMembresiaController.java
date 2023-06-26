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
@RequestMapping("/membresias")
public class TipoDeMembresiaController {
    @Autowired
    private TipoDeMembresiaService tS;
    @PostMapping
    public void insert(@RequestBody TipoDeMembresiaDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDeMembresia p = m.map(dto,TipoDeMembresia.class);
        tS.insert(p);
    }
    @GetMapping
    public List<TipoDeMembresiaDTO> list(){
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoDeMembresiaDTO.class);
        }).collect(Collectors.toList());
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
    @PutMapping
    public void goUpdate(@RequestBody TipoDeMembresiaDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDeMembresia p = m.map(dto,TipoDeMembresia.class);
        tS.insert(p);
    }


}
