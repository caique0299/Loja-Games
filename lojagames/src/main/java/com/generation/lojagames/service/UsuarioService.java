package com.generation.lojagames.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.lojagames.repository.UsuarioRepository;
import com.generation.lojagames.security.JwtService;
import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.model.UsuarioLogin;

import jakarta.annotation.Resource.AuthenticationType;
import jakarta.validation.Valid;

@Service
public class UsuarioService<BCryptPasswordEncoder> {

	public Optional<UsuarioLogin> atualizarUsuario1(@Valid Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<UsuarioLogin> autenticarUsuario1(Optional<UsuarioLogin> usuarioLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<UsuarioLogin> cadastrarUsuario1(@Valid Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationType authenticationManager;
	
	public Optional<Usuario> cadastrarUsuario(Usuario usuario){
		if(usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) 
			return Optional.empty();
		
		usuario.setSenha(criptografarSenha(usuario.getSenha()));
		
		return Optional.empty();
		
		
	}
	
	public Optional<Usuario> atualizarUsuario(Usuario usuario){
		if(usuarioRepository.findById(usuario.getId()).isPresent()) {
			Optional<Usuario> buscaUsuario = usuarioRepository.findByUsuario(usuario.getUsuario());
			
			if((buscaUsuario.isPresent()) && (buscaUsuario.get().getId() != usuario.getId()))
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuário já existe!!!",null);
			
			usuario.setSenha(criptografarSenha(usuario.getSenha()));
			
			return Optional.empty();
		}
		
		return Optional.empty();
	}
	

	

	
	private String criptografarSenha(String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	private String gerarToken(String usuario) {
		return "Bearer " + jwtService.generateToken(usuario);
	}

	public Optional<UsuarioLogin> autenticarUsuario(Optional<UsuarioLogin> usuarioLogin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


