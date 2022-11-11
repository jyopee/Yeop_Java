package com.yedam.java.c0604;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone iphoneSE3 = new SmartPhone();
		
		iphoneSE3.maker ="Apple";
		iphoneSE3.name ="iphoneSE3";
		iphoneSE3.price =1000000;
		
		System.out.println("나의 핸드폰 제조사는 "+iphoneSE3.maker+"입니다" );
		System.out.println("나의 핸드폰 기종은 "+iphoneSE3.name+"입니다" );
	
		iphoneSE3.call();
		iphoneSE3.hangUp();
		
		SmartPhone zflip = new SmartPhone();
		
		zflip.maker ="Samsung";
		zflip.name ="zflip";
		zflip.price =100000;
		
		System.out.println("나의 핸드폰 제조사는 "+zflip.maker+"입니다" );
		System.out.println("나의 핸드폰 기종은 "+zflip.name+"입니다" );
	
		zflip.call();
		zflip.hangUp();
		
		
		
	
		
	}

}
