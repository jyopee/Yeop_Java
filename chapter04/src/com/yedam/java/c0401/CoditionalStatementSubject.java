package com.yedam.java.c0401;

import java.util.Scanner;

public class CoditionalStatementSubject {

	public static void main(String[] args) {
		//문제1) 두개의 정수가 주어졌을때
		//		두 정수의 합이 자연수이면 'Natural Number'를 출력하는 코드를 작성하세요
		
		int num1=11;
		int num2=2;
		
		if( num1+num2 > 0) {
			System.out.println("Natural Number");
		}
		
		System.out.println("================================");
		//문제2) 두 개의 정수가 주어졌을때
		//      두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요
		
		if(num1 > num2) {
			System.out.println(" > ");
		}else if(num1<num2) {
			System.out.println(" < ");
		}else 
			System.out.println(" = ");
		
		System.out.println("================================");
		//문제3) 두 개의 정수가 주어졌을때
		//      두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요
		//		BMI = 체중(KG) / 키(M)*키(M)	
		//      저체중(18.5 미만) ,정상(18.5 이상 25미만),
		//		과체중(25이상 30미만),비만(30이상)
		
		double kg= 71.6;
		double hei = 1.73;
		double BMI=kg/(hei*hei);
		
		System.out.println(BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if (25 > BMI) {
			System.out.println("정상");
			
		}else if ( BMI >=25) {
			System.out.println("과체중");
		}else if (30>=BMI) {
			System.out.println("비만");
		}
		
		
		System.out.println("================================");
		
//		문제4) 선택한 단의 6번쨰 값을 출력하는 코드
//			  예를 들어, 2단일 경우 2*6 = 12
//			  단 출력문에는 변수를 사용하지 않는다
		
		int dan=6;
		
		switch(dan) {
		case 1:
			System.out.println("6 * 1 = 6");
		case 2:
			System.out.println("6 * 2 = 12");
		case 3:
			System.out.println("6 * 3 = 18");
		case 4:
			System.out.println("6 * 4 = 24");
		case 5:
			System.out.println("6 * 5 = 30");
		case 6:
			System.out.println("6 * 6 = 36");
			break;
		case 7:
			System.out.println("6 * 7 = 42");
		case 8:
			System.out.println("6 * 8 = 48");
		case 9:
			System.out.println("6 * 9 = 54");
			
		}
		
		System.out.println("================================");
		
//		문제5) 다음과 같이 점수 범위에 따라 등급을 구분
//			  해당 점수에 대한 등급을 출력하는 코드
//			  90점 이상 100점이하 :A등급
//			  80점 이상 90점미만 :B등급
//			  70점 이상 80점미만 :C등급
//			  60점 이상 70점미만 :D등급
//			  60점 미만 :E등급
		
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 점수를 입력하세요");
		int score = input.nextInt();
		int Score = score/10;
		
		
		
		switch(Score) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
		}
		
		
		
		
		
				
		
		
	}

}
