package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Role;
import com.universitymaps.universitymaps.repositories.RoleRepository;
import com.universitymaps.universitymaps.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }
}
