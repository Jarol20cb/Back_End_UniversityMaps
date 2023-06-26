package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor,Integer> {
    @Query(value="SELECT u.nombre_universidad,avg(p.calificacion_profesor) from profesores p \n" +
            "join universidades u on  p.universidad = u.id_universidad \n" +
            "group by u.nombre_universidad" ,nativeQuery = true)
    List<String[]> promedioCalificacionUniversidad();
}
