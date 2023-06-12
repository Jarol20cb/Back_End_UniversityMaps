package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Usuario;
import com.universitymaps.universitymaps.repositories.UsuarioRepository;
import com.universitymaps.universitymaps.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
