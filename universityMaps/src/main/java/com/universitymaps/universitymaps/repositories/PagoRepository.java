package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;

public interface PagoRepository extends JpaRepository<Pago,Integer> {
}
