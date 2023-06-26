package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UniversidadRepository extends JpaRepository<Universidad,Integer> {
    @Query(value = "SELECT u.id_universidad, u.nombre_universidad  \n" +
            "FROM universidades u where u.region_universidad='Lima'", nativeQuery = true)
    List<String[]> getUniversityLima();
}
