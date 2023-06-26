package com.universitymaps.universitymaps.controllers;

import com.universitymaps.universitymaps.dtos.DestinyDTO;
import com.universitymaps.universitymaps.dtos.RutaDTO;
import com.universitymaps.universitymaps.dtos.RutaDestinoDTO;
import com.universitymaps.universitymaps.dtos.UniversidadProfesorDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Ruta;
import com.universitymaps.universitymaps.services.RutaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutas")
public class RutaController {
    @Autowired
    private RutaService rS;
    @PostMapping
    public void insert(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta p = m.map(dto,Ruta.class);
        rS.insert(p);
    }
    @GetMapping
    public List<RutaDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RutaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RutaDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        RutaDTO dto=m.map(rS.ListId(id),RutaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody RutaDTO dto){
        ModelMapper m = new ModelMapper();
        Ruta p = m.map(dto,Ruta.class);
        rS.insert(p);
    }

    @GetMapping("/reporte5")
    public List<RutaDestinoDTO> getDestinoMasSelec(){
        List<RutaDestinoDTO> rutaDestinoDTOS=rS.reporte4();
        return rutaDestinoDTOS;
    }
}
