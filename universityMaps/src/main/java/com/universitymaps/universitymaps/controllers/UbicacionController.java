package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.UbicacionDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Ubicacion;
import com.universitymaps.universitymaps.services.UbicacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
    @Autowired
    private UbicacionService uuuS;
    @PostMapping
    public void insert(@RequestBody UbicacionDTO dto){
        ModelMapper m = new ModelMapper();
        Ubicacion p = m.map(dto,Ubicacion.class);
        uuuS.insert(p);
    }
    @GetMapping
    public List<UbicacionDTO> list(){
        return uuuS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UbicacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        uuuS.delete(id);
    }
    @GetMapping("/{id}")
    public UbicacionDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        UbicacionDTO dto=m.map(uuuS.ListId(id),UbicacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UbicacionDTO dto){
        ModelMapper m = new ModelMapper();
        Ubicacion p = m.map(dto,Ubicacion.class);
        uuuS.insert(p);
    }
}
