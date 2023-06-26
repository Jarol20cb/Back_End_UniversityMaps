package com.universitymaps.universitymaps.controllers;


import com.universitymaps.universitymaps.dtos.UserDTO;
import com.universitymaps.universitymaps.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import com.universitymaps.universitymaps.repositories.UserRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import com.universitymaps.universitymaps.entities.Users;
import javax.validation.Valid;
@Controller
@Secured({"ROLE_ADMIN"})
@RequestMapping("/registro")
public class UserController {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository uR;
	@PostMapping
	public String addUser(@RequestBody Users dto){
		String pass=dto.getPassword();
		String encPass=passwordEncoder.encode(pass);
		dto.setPassword(encPass);
		uR.save(dto);
		return "Se agrego el usuario exitosamente";
	}

}
