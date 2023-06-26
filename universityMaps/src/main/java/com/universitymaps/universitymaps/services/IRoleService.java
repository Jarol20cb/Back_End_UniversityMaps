package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    List<Role> list();
}
