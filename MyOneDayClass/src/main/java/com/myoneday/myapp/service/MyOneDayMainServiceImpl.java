package com.myoneday.myapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
