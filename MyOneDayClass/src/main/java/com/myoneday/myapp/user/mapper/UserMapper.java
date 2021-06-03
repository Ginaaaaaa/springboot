package com.myoneday.myapp.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.myoneday.myapp.user.entity.User;

@Mapper
public interface UserMapper {
	
	int checkRegistId(String userId);
	void insertUserRegist(User user);
}
