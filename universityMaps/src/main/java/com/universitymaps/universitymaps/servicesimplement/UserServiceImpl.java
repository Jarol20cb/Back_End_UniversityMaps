package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Role;
import com.universitymaps.universitymaps.entities.Users;
import com.universitymaps.universitymaps.repositories.UserRepository;
import com.universitymaps.universitymaps.services.IRoleService;
import com.universitymaps.universitymaps.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public Integer insert(Users user) {
        int awns = uR.findUsername(user.getUsername());
        if (awns == 0) { uR.save(user); }
        return awns;
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }
}
