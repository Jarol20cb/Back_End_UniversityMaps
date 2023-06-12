package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
