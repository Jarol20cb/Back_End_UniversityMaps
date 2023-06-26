package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.dtos.UniversidadProfesorDTO;
import com.universitymaps.universitymaps.dtos.UsuarioUniversidadDTO;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Profesor;
import com.universitymaps.universitymaps.repositories.ProfesorRepository;
import com.universitymaps.universitymaps.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class ProfesorServiceImplement implements ProfesorService {
    @Autowired
    private ProfesorRepository ppR;
    @Override
    public void insert(Profesor profesor) {
        ppR.save(profesor);
    }

    @Override
    public List<Profesor> list() {
        return ppR.findAll();
    }

    @Override
    public void delete(int idProfesor) {
ppR.deleteById(idProfesor);
    }

    @Override
    public Profesor ListId(int IdProfesor) {
        return ppR.findById(IdProfesor).orElse(new Profesor());
    }

    @Override
    public List<UniversidadProfesorDTO> reporte2() {
        List<String[]> universidadXprofesor=ppR.promedioCalificacionUniversidad();
        List<UniversidadProfesorDTO> universidadProfesorDTOS=new ArrayList<>();

        for (String[] data:universidadXprofesor){
            UniversidadProfesorDTO dto=new UniversidadProfesorDTO();
            dto.setNombreUniversidad(data[0]);
            dto.setPromedioProfesor(Float.parseFloat(data[1]));
            universidadProfesorDTOS.add(dto);
        }
        return universidadProfesorDTOS;
    }
}
