package com.example.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.UserModel;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	@RequestMapping(value="/login", method = {RequestMethod.POST})
	public ResponseEntity<LoginResponse> login(@RequestBody UserModel user,HttpServletRequest request){
		
		String username = user.getUsername();
		String password = user.getPassword();
		int role = user.getRole();
		int client_id = user.getClient_id();
		
		
		return null;
		
	}

}
