package com.java.config;


import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());

		if (roles.contains("ROLE_ADMIN")) {
			response.sendRedirect("/admin/");
		} else if (roles.contains("ROLE_TEACHER")) {
			response.sendRedirect("/teacher/");
		} else {
			response.sendRedirect("/user/");
		}

	}

	@Override
	public void onAuthenticationSuccess(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response, Authentication authentication)
			throws IOException, jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
		
	}



}