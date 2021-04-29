package com.myoneday.myapp.user.entity;

public class User {
	
	private String userNo;
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userLoginDate;   //최종 로그인 일자
	private String userRegistDate;  //가입일자
	private String userUpdateDate;  //정보수정 일자
	private String userLevel;       //회원등급
	
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserLoginDate() {
		return userLoginDate;
	}
	public void setUserLoginDate(String userLoginDate) {
		this.userLoginDate = userLoginDate;
	}
	public String getUserRegistDate() {
		return userRegistDate;
	}
	public void setUserRegistDate(String userRegistDate) {
		this.userRegistDate = userRegistDate;
	}
	public String getUserUpdateDate() {
		return userUpdateDate;
	}
	public void setUserUpdateDate(String userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}
