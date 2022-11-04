package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int value = 15;
//
//		int value2 = 0;
//		if (value > 10) {
//			value2 = value - 10;
//		}
//
//		int result = value + value2 + 5;
//
//		System.out.println(value + "," + value2 + "," + result);

		int v1 = 1;
		int v2 = 0;
		int v3 = 0;
		if (v1 == 0) {

			if (v2 == 0) {
				v2 = 2;
				v3 = v1 + v2;
				System.out.println(v1 + "+" + v2 + "=" + v3);
			}
			System.out.println(v1 + "+" + v2 + "=" + v3);
		}
		System.out.println(v1 + "+" + v2 + "=" + v3);

	}

}
