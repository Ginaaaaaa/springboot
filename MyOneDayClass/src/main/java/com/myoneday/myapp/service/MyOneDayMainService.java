package com.myoneday.myapp.service;

import java.util.List;

import com.myoneday.myapp.entity.ClassVO;
import com.myoneday.myapp.entity.UserInfoVO;


public interface MyOneDayMainService {
	
	public List<UserInfoVO> selectUserInfo();
	public List<ClassVO> getRecentClassInfo();
}
