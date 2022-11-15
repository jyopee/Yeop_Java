package com.yedam.java.boxing;

public class BoxingUnbloxing {

	public static void main(String[] args) {
		//박싱
		
		//1) 생성자를 사용한 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		//2) 생성자를 사용하지 않는 박싱
		Integer obj3 = Integer.valueOf("300");
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		
		System.out.println(value1+value2+value3);
		System.out.println(value2);
		System.out.println(value3);
		
		//자동 박싱
		Integer obj4 = 100;
		//자동 언박싱
		int value4 = obj4;
		int value5 = obj4.intValue();
		
		int value6 = Integer.parseInt("777");
		int value7 = Integer.parseInt("333");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	
		
	
	
	}
	

}
