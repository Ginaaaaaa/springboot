package com.myoneday.myapp.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoneday.myapp.user.entity.User;
import com.myoneday.myapp.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean checkRegistId(String userId) {
		boolean result = true;
		
		int isUserId = userMapper.checkRegistId(userId);
		
		if(isUserId > 0) {
			result = false;
		}
		
		return result;
	}

	@Override
	public String insertUserRegist(User user) {
		String result = "";
		try {
			userMapper.insertUserRegist(user);
			return result = "SUCCESS";
		}catch(Exception e){
			e.printStackTrace();
			return result = "FALE";
		}
	}

}
