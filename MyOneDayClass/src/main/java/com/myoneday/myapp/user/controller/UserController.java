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
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
    
	/**
	 * @Method 아이디 중복검사
	 * @param String userId
	 * @return boolean
	 * @Data 2021.04.30
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
	 * @Method 회원 가입
	 * @param User user
	 * @return String
	 * @Data 2021.05.27
	 */
	@PutMapping("/regist")
	public ResponseEntity<?> userRegist(@ModelAttribute User user){
		String result = "SUCCESS";
		try {
			result = userService.insertUserRegist(user);
		}catch(Exception e) {
			result = "FAIL";
			e.printStackTrace();
		}
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> userLogin(@Param(value="userId") String userId,
			                           @Param(value="userPw") String userPw){
		boolean result = true;
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
			result = false;
		}
		return ResponseEntity.ok(result);
	}

}
