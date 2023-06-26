package com.universitymaps.universitymaps.services;

import com.universitymaps.universitymaps.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert (Users user);
    List<Users> list();
}
