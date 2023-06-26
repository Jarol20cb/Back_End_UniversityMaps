package com.universitymaps.universitymaps.repositories;

import com.universitymaps.universitymaps.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Column;
import java.util.List;

public interface PagoRepository extends JpaRepository<Pago,Integer> {
    @Query(value="SELECT m.descripcion_tipo_de_membresia,COUNT(*) from pagos p \n" +
            "join membresiatipos m on p.tipodemembresia=m.id_tipo_de_membresia \n" +
            "group by m.descripcion_tipo_de_membresia" ,nativeQuery = true)
    List<String[]> getCantUsuarioXMmebresia();

    @Query(value="SELECT p.metodo_pago,SUM(p.monto_pago) from pagos p \n" +
            "group by p.metodo_pago" ,nativeQuery = true)
    List<String[]> getSumaMontoXMetodo();

    @Query(value="SELECT descripcion_tipo_de_membresia tipo_membresia,SUM(monto_pago) venta_total\n" +
            "FROM pagos o JOIN membresiatipos u ON o.tipodemembresia=u.id_tipo_de_membresia\n" +
            "GROUP BY u.descripcion_tipo_de_membresia" ,nativeQuery = true)
    List<String[]> getSumaMontoXMembresia();
}
