package com.generation.lojagames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.model.UsuarioLogin;

@SuppressWarnings("unused")
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);

	public List<Usuario> findAll();

	public Optional<Usuario> findById(Long id);

	public <S> S save(Usuario usuario);
}
