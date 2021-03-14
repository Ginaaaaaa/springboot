package com.myoneday.myapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class MyOneDayClassController {
	
	@GetMapping("/myoneday")
	public Map<String, Object> demoapistring() {
		String param = "Hello Springboot!";
		Map<String, Object> map = new HashMap<>();
		map.put("param", param);
		return map;
	}
	
	
	@GetMapping("/demoapi")
	public Map<String, Object> demoapi() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("birthday", 15920505);
		return map;
	}
}
