package com.yedam.java.toString;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1";
	// String b = "1"; 같은 주소
	// String c = new String("1"); new 선언시 완전 새로운 주소 생성

	// 바이트 -> 문자열

	public static void main(String[] args) {
		
		byte [] bytes = {72,101,108,108,111,32,74,97,118,97};
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
//		String str2 = new String(바이트 배열,시작점,갯수);
		System.out.println(str2);
		
		String ssn = "123456-28910";
		char sex = ssn.charAt(7);
		
		
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("남자");
			break;
		case '2' :
		case '4' :
			System.out.println("여자");
			break;
		}
		
		//equals()
		
		
		//주소 비교
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 ="자바";
		
		if (strVar1 == strVar1) {
			System.out.println("같은 string 객체 참조");
		}else {
			System.out.println("가른 string 객체 참조");
		}
		
		if (strVar1.equals(strVar3)) {
			System.out.println("같은 string 객체 참조");
		}else {
			System.out.println("가른 string 객체 참조");
		}
		
		byte[] byte2 = null;
		String str ="안녕하세요";
		byte2 =str.getBytes();
		
		System.out.println(byte2.length);
		String str3 = new String(byte2);
		System.out.println("byte2 => String"+byte2);
		
		try {
			byte[] byte3 = str.getBytes("EUC-KR");
			System.out.println("byte3.length :"+byte3.length);
			
			String str4 = new String(byte3,"EUC-KR");
			System.out.println("byte3 => String"+byte3.length);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//문자열 위치 변경
		
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바","Java");
		
		System.out.println(newStr);
		
		
		//** Stringbuilder 또는 buffer
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append(123);
		
		System.out.println(sb);
		
		String strVal ="asdasfqerfa";
		String strVal2 ="DSFAFSAFSADSADSAD";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		//trim
		
		String strTrim ="     자바     ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
	
		
		//subString
		
		String ssn2 ="990802-12423423";
		
		String firstNum = ssn2.substring(0,6);
		String SecondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(SecondNum);
		
		
		//split
		
		String strSplit = "1-2-1-2-1-3-2-1-2-1-";
		String[] strAry = strSplit.split("-");
		
		for(String temp : strAry) {
			System.out.println(temp);
		}
		
		//문자열 변환
		//숫자나,소수,불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println("strChng");
		System.out.println("strChng2");
		System.out.println("strChng3");
		
	}

}
