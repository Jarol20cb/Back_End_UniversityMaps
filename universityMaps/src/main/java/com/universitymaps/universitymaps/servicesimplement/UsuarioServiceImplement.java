package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.dtos.RutaDestinoDTO;
import com.universitymaps.universitymaps.dtos.UsuarioUniversidadDTO;
import com.universitymaps.universitymaps.dtos.reporte6;
import com.universitymaps.universitymaps.dtos.reporte8;
import com.universitymaps.universitymaps.entities.Usuario;
import com.universitymaps.universitymaps.repositories.UsuarioRepository;
import com.universitymaps.universitymaps.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioServiceImplement implements UsuarioService {
    @Autowired
    private UsuarioRepository uuR;
    @Override
    public void insert(Usuario usuario) {
        uuR.save(usuario);

    }

    @Override
    public List<Usuario> list() {
        return uuR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
uuR.deleteById(idUsuario);
    }

    @Override
    public Usuario ListId(int IdUsuario) {
        return uuR.findById(IdUsuario).orElse(new Usuario());
    }

    @Override
    public List<UsuarioUniversidadDTO> reporte1() {
        List<String[]> usuarioXuniversidad=uuR.getUsuarioByUniversidad();
        List<UsuarioUniversidadDTO> usuarioUniversidadDTOS=new ArrayList<>();

        for (String[] data:usuarioXuniversidad){
            UsuarioUniversidadDTO dto=new UsuarioUniversidadDTO();
            dto.setNombreUsuario(data[0]);
            dto.setNombreUniversidad(data[1]);
            usuarioUniversidadDTOS.add(dto);
        }
        return usuarioUniversidadDTOS;
    }

    @Override
    public List<reporte6> reporte6() {
        List<String[]> usuariosXuniversidad=uuR.getUsuariosByUni();
        List<reporte6> reporte6s=new ArrayList<>();

        for (String[] data:usuariosXuniversidad){
            reporte6 dto=new reporte6();
            dto.setNombreUniversidad(data[0]);
            dto.setContadorUsuarios(Integer.parseInt(data[1]));
            reporte6s.add(dto);
        }
        return reporte6s;
    }

    @Override
    public List<reporte8> reporte8() {
        List<String[]> usuariosXubifav=uuR.getNameUsuUbiFav();
        List<reporte8> reporte8s=new ArrayList<>();

        for (String[] data:usuariosXubifav){
            reporte8 dto=new reporte8();
            dto.setNombreUsuario(data[0]);
            dto.setContadorUbicacionesFavoritas(Integer.parseInt(data[1]));
            reporte8s.add(dto);
        }
        return reporte8s;
    }
}
