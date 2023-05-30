package com.universitymaps.tipomembresiaum.repositories;

import com.universitymaps.tipomembresiaum.entities.Membresia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPMembresiaRepository extends JpaRepository<Membresia, Integer> {
}
