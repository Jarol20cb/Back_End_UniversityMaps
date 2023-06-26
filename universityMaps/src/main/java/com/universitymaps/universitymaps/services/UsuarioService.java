package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.dtos.UsuarioUniversidadDTO;
import com.universitymaps.universitymaps.dtos.reporte6;
import com.universitymaps.universitymaps.dtos.reporte8;
import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario ListId(int IdUsuario);
    public List<UsuarioUniversidadDTO> reporte1();
    public List<reporte6> reporte6();
    public List<reporte8> reporte8();
}
