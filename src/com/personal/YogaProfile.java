package com.personal;

public class YogaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstants.FIRST_NAME+"YOGA");
		System.out.println(ProfileConstants.LAST_NAME+"PRIYA");
//	System.out.println(ProfileConstants."Age : 19");
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("MyHobbies : playing shuttle");
	}
	
}
