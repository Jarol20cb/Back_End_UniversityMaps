package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.UbicacionDTO;
import com.universitymaps.universitymaps.dtos.UbicacionFavDTO;
import com.universitymaps.universitymaps.entities.Ubicacion;
import com.universitymaps.universitymaps.entities.UbicacionFav;
import com.universitymaps.universitymaps.services.UbicacionFavService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ubicacionesfav")
public class UbicacionFavController {
    @Autowired
    private UbicacionFavService fR;
    @PostMapping // sent method
    public void insert(@RequestBody UbicacionFavDTO dto){
        ModelMapper m = new ModelMapper();
        UbicacionFav p = m.map(dto,UbicacionFav.class); // takes dto and converts it to a Pet class
        fR.insert(p);
    }
    @GetMapping // get data (doesn't need a route)
    public List<UbicacionFavDTO> list(){
        return fR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UbicacionFavDTO.class);
        }).collect(Collectors.toList()); // recognize that return a data group
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        fR.delete(id);
    }
    @GetMapping("/{id}")
    public UbicacionFavDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        UbicacionFavDTO dto=m.map(fR.ListId(id),UbicacionFavDTO.class);
        return dto;
    }
    @PutMapping // sent method
    public void goUpdate(@RequestBody UbicacionFavDTO dto){
        ModelMapper m = new ModelMapper();
        UbicacionFav p = m.map(dto,UbicacionFav.class); // takes dto and converts it to a Pet class
        fR.insert(p);
    }
}
