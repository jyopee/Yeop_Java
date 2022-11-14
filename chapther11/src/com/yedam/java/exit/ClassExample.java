package com.yedam.java.exit;


public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		// key 클래스 객체 가져오기 1탄
		Class clazz = key.class;
		System.out.println(clazz);
		
		Class clazz2 =Class.forName("com.yedam.java.exit.key");
		
		System.out.println(clazz2);
		
		key key = new key (1);
		
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);;
		
		
	}

}
