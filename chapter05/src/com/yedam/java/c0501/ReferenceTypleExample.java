package com.yedam.java.c0501;

public class ReferenceTypleExample {

	public static void main(String[] args) {
		// Null 과 NullPointerException
		
//		String str=null;
//		System.out.println("길이 :" +str.length());
		
		//String(문자열) 비교
		String strVar1 ="신미철";
		String strVar2 ="신미철";
		
		if(strVar1 ==strVar2) {
			System.out.println("strVar1과 starVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 starVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2 문자열이 같음");
		}
		String strVar3 =new String("신미철");
		String strVar4 =new String("신미철");
		
		if(strVar3 ==strVar4) {
			System.out.println("strVar1과 starVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 starVar2는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4 문자열이 같음");		}

	}

}
