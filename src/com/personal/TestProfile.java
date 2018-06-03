package com.personal;

public class TestProfile {
	 static void printProfile(IProfile profile){
	 profile.myBasicInfo();
	 profile.myHobbies();
		
	}
	 public static void main(String[] args) {
	//	IProfile myProfile = new VedhaProfile();
	IProfile myProfile = new YogaProfile();
	   printProfile(myProfile);  
	}
       
}
