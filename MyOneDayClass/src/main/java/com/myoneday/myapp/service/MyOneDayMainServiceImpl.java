package com.myoneday.myapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoneday.myapp.entity.ClassVO;
import com.myoneday.myapp.entity.UserInfoVO;
import com.myoneday.myapp.mapper.MyOneDayMain;


@Service
public class MyOneDayMainServiceImpl implements MyOneDayMainService{

	@Autowired
	MyOneDayMain mapper;
	
	@Override
	public List<UserInfoVO> selectUserInfo() {
		List<UserInfoVO> result = new ArrayList<UserInfoVO>();
		result = mapper.getUserInfo();
		
		return result;
	}

	@Override
	public List<ClassVO> getPopularClassInfo() {
		List<ClassVO> result = new ArrayList<ClassVO>();
		result = mapper.getPopularClassInfo();
		return result;
	}

	@Override
	public List<ClassVO> getRecentClassInfo() {
		List<ClassVO> result = new ArrayList<ClassVO>();
		result = mapper.getRecentClassInfo();
		return result;
	}

}
