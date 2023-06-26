package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.dtos.Reporte3;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Universidad;
import com.universitymaps.universitymaps.repositories.UniversidadRepository;
import com.universitymaps.universitymaps.services.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
@Service
public class UniversidadServiceImplement implements UniversidadService {
    @Autowired
    private UniversidadRepository uR;
    @Override
    public void insert(Universidad universidad) {
uR.save(universidad);
    }

    @Override
    public List<Universidad> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUniversidad) {
uR.deleteById(idUniversidad);
    }

    @Override
    public Universidad ListId(int IdUniversidad) {
        return uR.findById(IdUniversidad).orElse(new Universidad());
    }

    @Override
    public List<Reporte3> reporte3() {
        List<String[]> universityReport=uR.getUniversityLima();
        List<Reporte3> universityReportLima=new ArrayList<>();
        for (String[] data:universityReport){
            Reporte3 dto = new Reporte3();
            dto.setNombreUniversidad(data[1]);
            dto.setIdUniversidad(Integer.parseInt(data[0]));
            universityReportLima.add(dto);
        }
        return universityReportLima;
    }
}
