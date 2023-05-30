package com.generation.lojagames.security;

import javax.swing.text.PasswordView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.generation.lojagames.security.JwtAuthFilter;
import com.generation.lojagames.security.UserDetailsServiceImpl;

@Configuration
@EnableWebMvc
public class BasicSecurityConfig<DaoAuthenticationProvider, AuthenticationProvider> {

	@Autowired
    private JwtAuthFilter authFilter;

    @Bean
    UserDetailsServiceImpl userDetailsService() {

        return new UserDetailsServiceImpl();
    }

    @Bean
    PasswordView passwordEncoder() {
        return new PasswordView(null);
    }



}

