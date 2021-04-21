package com.myoneday.myapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myoneday.myapp.entity.ClassVO;
import com.myoneday.myapp.service.MyOneDayMainService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class MyOneDayClassController {
	
	@Autowired
	MyOneDayMainService mainService;

	@GetMapping("/myoneday/main")
	public ResponseEntity<Map<String, List<ClassVO>>> demoapistring() {
		Map<String, List<ClassVO>> map = new HashMap<>();
		List<ClassVO> popularClassInfoList = mainService.getPopularClassInfo();
		List<ClassVO> recentClassInfoList = mainService.getRecentClassInfo();
		
		map.put("popularClassInfoList", popularClassInfoList);
		map.put("recentClassInfoList", recentClassInfoList);		

		return ResponseEntity.ok(map);
	}	
	
//	@GetMapping("/myoneday/main")
//	public Map<String, Object> demoapistring() {
//		Map<String, Object> map = new HashMap<>();
//		List<ClassVO> recentClassInfoList = mainService.getRecentClassInfo();
//		
//		map.put("recentClassInfoList", recentClassInfoList);
//		return map;
//	}


	
//	@GetMapping("/demoapi")
//	public Map<String, Object> demoapi() {
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "홍길동");
//		map.put("birthday", 15920505);
//		return map;
//	}
//	
//	@GetMapping("/test")
//	public Map<String, Object> test() {
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "홍길");
//		map.put("birthday", 15920505);
//		return map;
//	}
}
