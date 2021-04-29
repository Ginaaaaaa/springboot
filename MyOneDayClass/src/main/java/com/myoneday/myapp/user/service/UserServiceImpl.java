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
	public void insertUserRegist(User user) {
		userMapper.insertUserRegist(user);
	}

}
