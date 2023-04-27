package com.example.EmployeeSecurityJwt.service;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.EmployeeSecurityJwt.Entity.User;
import com.example.EmployeeSecurityJwt.repo.UserRepository;
import com.example.EmployeeSecurityJwt.util.JwtUtil;
@Service
public class UserService implements UserDetailsService  {
	@Autowired
	private UserRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{
	User user=repo.findByUsername(username);
		 return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),new ArrayList<>());
	}
	

}
