package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RutaRepository extends JpaRepository<Ruta,Integer> {
    @Query(value="SELECT d.pabellon_destino,d.aula_destino,COUNT(*) from rutas r \n" +
            "join destinies d on r.destino=id_destino \n" +
            "group by d.pabellon_destino,d.aula_destino order by COUNT(*) DESC \n" +
            "limit 1" ,nativeQuery = true)
    List<String[]> getDestinoMasSelec();
}
