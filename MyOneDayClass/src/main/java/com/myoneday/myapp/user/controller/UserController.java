package com.myoneday.myapp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myoneday.myapp.user.entity.User;
import com.myoneday.myapp.user.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
    
	@PutMapping("/regist")
	public ResponseEntity<?> userRegist(@RequestBody User user){
		boolean success = false;
		try {
//			userService.insertUserRegist(user);
			success = true;
		}catch(Exception e) {
			success = false;
			e.printStackTrace();
		}
		return ResponseEntity.ok(success);
	}
}
