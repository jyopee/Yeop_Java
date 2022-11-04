package com.yedam.java0301;

public class Class_1 {

	public static void main(String[] args) {

		int a = -100;
		int result1 = +a;
		int result2 = -a;

		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);

		byte b = 100;
//		byte result3 =(byte)-b;  //강제 타입 변환
		int result3 = -b;
		System.out.println("result3 :" + result3);

	}

}
