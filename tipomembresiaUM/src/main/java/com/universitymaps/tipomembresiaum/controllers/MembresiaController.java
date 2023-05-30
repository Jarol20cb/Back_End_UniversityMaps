package com.universitymaps.tipomembresiaum.controllers;


import com.universitymaps.tipomembresiaum.dtos.MembresiaDTO;
import com.universitymaps.tipomembresiaum.entities.Membresia;
import com.universitymaps.tipomembresiaum.services.IPMembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresias")
public class MembresiaController {
    @Autowired //se debe conectar para la interface
    private IPMembresiaService Mt;

    @PostMapping
    public void insert(@RequestBody MembresiaDTO dto){
        ModelMapper m= new ModelMapper();
        Membresia p=m.map(dto, Membresia.class);
        Mt.insert(p);
    }

    //metodo list
    @GetMapping
    public List<MembresiaDTO> list()
    {
        return Mt.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MembresiaDTO.class);
        }).collect(Collectors.toList());    //aca se reconoce que es un conjunto de datos
    }

    @DeleteMapping("/{id}")    //para eliminar
    public void delete(@PathVariable("id")Integer id){
        Mt.delete(id);
    }

    @GetMapping("/{id}") //para listar
    public MembresiaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        MembresiaDTO dto=m.map(Mt.ListId(id),MembresiaDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody MembresiaDTO dto){
        ModelMapper m= new ModelMapper();
        Membresia p=m.map(dto, Membresia.class);
        Mt.insert(p);
    }
}
