package com.universitymaps.universitymaps.servicesimplement;

import com.universitymaps.universitymaps.entities.Users;
import com.universitymaps.universitymaps.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        user.getRoles().forEach(role -> {
            roles.add(new SimpleGrantedAuthority(role.getRol()));
        });
        UserDetails ud = new org.springframework.security.core.userdetails.User
                (user.getUsername(), user.getPassword(), user.getEnabled(),
                        true, true, true, roles);
        return ud;
    }
}
