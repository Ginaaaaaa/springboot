package com.myoneday.myapp.user.service;

import com.myoneday.myapp.user.entity.User;

public interface UserService {
	
	boolean checkRegistId(String userId);
	boolean insertUserRegist(User user);

}
