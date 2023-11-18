package com.example.demo.application.security;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(customizer -> customizer.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll().anyRequest().authenticated())
		.formLogin(login -> login.loginProcessingUrl("/login")
				.loginPage("/")
				.defaultSuccessUrl("/portal")
				.failureUrl("/?error").permitAll())
				.logout(logout -> logout.logoutSuccessUrl("/")).csrf(csrf -> csrf.disable());
		return http.build();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
