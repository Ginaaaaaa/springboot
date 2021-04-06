package com.myoneday.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myoneday.myapp.entity.ClassVO;
import com.myoneday.myapp.entity.UserInfoVO;

@Mapper
public interface MyOneDayMain {

	List<UserInfoVO> getUserInfo();
	List<ClassVO> getRecentClassInfo();	
}
