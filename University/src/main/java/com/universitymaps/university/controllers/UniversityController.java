package com.universitymaps.university.controllers;

import com.universitymaps.university.dtos.UniversityDTO;
import com.universitymaps.university.entities.University;
import com.universitymaps.university.services.IUniversityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/university")
public class UniversityController {
    @Autowired
    private IUniversityService uS;

    // insert
    @PostMapping
    public void insert(@RequestBody UniversityDTO dto){
        ModelMapper m = new ModelMapper();
        University u = m.map(dto, University.class);
        uS.insert(u);
    }

    // list
    @GetMapping
    public List<UniversityDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversityDTO.class);
        }).collect(Collectors.toList());
    }

    // delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id) { uS.delete(id); }

    // listId
    @GetMapping("/{id}")
    public UniversityDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m = new ModelMapper();
        UniversityDTO dto = m.map(uS.listId(id),UniversityDTO.class);
        return dto;
    }

    //update
    @PutMapping
    public void goUpdate(@RequestBody UniversityDTO dto){
        ModelMapper m = new ModelMapper();
        University u = m.map(dto, University.class);
        uS.insert(u);
    }
}
