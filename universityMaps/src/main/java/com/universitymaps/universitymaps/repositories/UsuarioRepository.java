package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query(value="SELECT us.nombre_usuario,un.nombre_Universidad from usuarios us \n" +
        "join universidades un on  us.id_usuario = un.id_universidad \n" ,nativeQuery = true)
    List<String[]>getUsuarioByUniversidad();

    @Query(value="SELECT un.nombre_universidad,COUNT(*) from usuarios us\n" +
            "join universidades un on us.universidad=un.id_universidad\n" +
            "group by un.nombre_universidad order by COUNT(*) DESC" ,nativeQuery = true)
    List<String[]>getUsuariosByUni();

    @Query(value="SELECT nombre_usuario,COUNT(*) \n" +
            "FROM usuarios u JOIN ubicacionesfav f ON u.id_usuario=f.usuario \n" +
            "GROUP BY u.id_usuario\n" ,nativeQuery = true)
    List<String[]>getNameUsuUbiFav();

}

