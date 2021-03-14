package com.myoneday.myapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myoneday.myapp.entity.UserInfoVO;
import com.myoneday.myapp.service.MyOneDayMainService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class MyOneDayClassController {
	
	@Autowired
	MyOneDayMainService mainService;
	
	@GetMapping("/myoneday")
	public Map<String, Object> demoapistring() {
		Map<String, Object> map = new HashMap<>();
		List<UserInfoVO> userInfo = mainService.selectUserInfo();
		
		map.put("userInfo", userInfo);
		return map;
	}
	
	
	@GetMapping("/demoapi")
	public Map<String, Object> demoapi() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("birthday", 15920505);
		return map;
	}
	
	@GetMapping("/test")
	public Map<String, Object> test() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "홍길");
		map.put("birthday", 15920505);
		return map;
	}
}