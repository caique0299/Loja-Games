package com.generation.lojagames.security;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.repository.UsuarioRepository;
import com.generation.lojagames.security.UserDetailsImpl;

@SuppressWarnings("unused")
@Service
public class UserDetailsServiceImpl {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UserDetailsImpl loadUserByUsername(String userName) throws AccountNotFoundException{
		return null;

}
}


