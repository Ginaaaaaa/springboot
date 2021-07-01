package com.myoneday.myapp.user.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myoneday.myapp.user.entity.User;
import com.myoneday.myapp.user.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
    
	/**
	 * @Method checkRegistId
	 * @param String userId
	 * @return boolean
	 * 아이디 중복 검증 메소드
	 */
	@GetMapping("/checkRegistId")
	public ResponseEntity<?> checkRegistId(@Param(value="userId") String userId){
		boolean result =true;
		try {
			result = userService.checkRegistId(userId);
		}catch(Exception e) {
			e.printStackTrace();
			result = false;
		}
		return ResponseEntity.ok(result);
	}
	
	/**
	 * @Method userRegist
	 * @param User user
	 * @return String
	 * 회원 가입(회원 저장) 메소드
	 */
	@PutMapping("/regist")
	public ResponseEntity<?> userRegist(@RequestBody User user){
		boolean result = true;
		try {
			result = userService.insertUserRegist(user);
		}catch(Exception e) {
			result = false;
			e.printStackTrace();
		}
		return ResponseEntity.ok(result);
	}
	
	/**
	 * @Method userLogin
	 * @param User user
	 * @return String
	 * 회원 로그인 검증 메소드
	 */
	@PutMapping("/login")
	public ResponseEntity<?> userLogin(@RequestBody User user){
		boolean result = true;
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
			result = false;
		}
		return ResponseEntity.ok(result);
	}

}
