package com.generation.lojagames.security;

import java.util.Collection;
import java.util.List;



import com.generation.lojagames.model.Usuario;

public class UserDetailsImpl<GrantedAuthority> {

private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}
	
	public UserDetailsImpl() {
		
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return authorities;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return userName;
	}
	
	public boolean isAccountNonExpired() {
		return true;
	}
	
	public boolean isAccountNonLocked() {
		return true;
	}
	
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	public boolean isEnabled() {
		return true;
	}
	

}
