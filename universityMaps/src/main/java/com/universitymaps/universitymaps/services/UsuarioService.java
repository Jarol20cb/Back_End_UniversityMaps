package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario ListId(int IdUsuario);
}
