package com.yedam.java.ch0201;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		// 컴퓨터가 인식하는 클래스 이름은 (= 패키지 이름.클래스)

//		int value =123;
	//	
//		System.out.printf("상품의 가격은 :%d원\n",value);
//		System.out.printf("상품의 가격은 :%6d원\n",value);
//		System.out.printf("상품의 가격은 :%-6d원\n",value);
//		System.out.printf("상품의 가격은 :%06d원\n",value);
	//	
//		double area =3.14159 * 10 *10;
//		System.out.println(area);
//		System.out.printf("반지금이%d인 원의 넚이:%10.2f\n",10,area);
//		System.out.println();
	//	
//		System.out.println("문자를 입력하세요 :");
	//	
////		String str =SC.nextLine();            엔터칠떄까지 문장을 읽음
	//	
////		String str =SC.next();
////		System.out.println("숫자 를 입력하세요 :");
////		int var = SC.nextInt();
////		System.out.println("입력 :"+str+","+var);
	////	
////		System.out.println("첫번째 :");
////		String x =SC.nextLine();
	////	
	////
////		System.out.println("두번째 :");
////		String y =SC.nextLine();                     //한줄에 입력하기 어려움 
	////	
////		int result =Integer.parseInt(x)+Integer.parseInt(y);
////		System.out.println(result);
	//	
//		int x =SC.nextInt();
//		int y =SC.nextInt();
	//	
//		System.out.println("입력 :"+(x+y));

			Scanner SC = new Scanner(System.in);

			String inputData;

			while (true) {
				System.out.println("문자를 입력하세요");
				inputData = SC.nextLine();
				System.out.printf("입력된 문자열: %s\n", inputData);
				if (inputData.equals("exit")) {
				}break;

			}
			System.out.println("종료");
	}

}
