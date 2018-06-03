package com.personal;

public class VedhaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstants.FIRST_NAME+"vedha");
		System.out.println(ProfileConstants.LAST_NAME+"varshini");
		//System.out.println("Age : 12");
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("Hobbies : drawing");
	}
	

}
