package com.yedam.java0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
//		문제1) 책 161페이지 5번
//			for문을 이용해서 다음과 같이 * 출력하는 코드

//		String star = "";
//		for (int i = 1; i <= 5; i++) {
//			star += "*";
//			System.out.println(star);
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			System.out.println();
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//
//			}
//		}
//
//		System.out.println();
//		System.out.println("==============================");
//
//		// 문제2) for문을 이용해서 1부터 100까지 정수 중에서 2의 배수가 아닌 숫자의 갯수를 구하세요
//		int cnt = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 != 0) {
//				cnt += 1;
////				System.out.println(i);
//			}
//		}
//		System.out.println(cnt);
//
//		int cnt1 = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0)
//				continue;
//			cnt1++;
//		}
//		System.out.println(cnt);

		
		//방정식
		
//		Outter:for (int x = 1; x <= 10; x++) {
//			for (int y = 1; y <= 10; y++) {
//
//				if (((4 * x) + (5 * y)) == 60)
//					System.out.println("{"+x + "," + y+"}");
////					 break Outter;
//			}
//			
//		}

//		
		
		//7이 나오면 멈추고 아니면 계속 도는 프로그램을 짜시오
//int num1=0;
//		
//		do {
//			num1=(int)(Math.random() * 10) + 1;
//			System.out.println(num1);
//		}while(num1 !=7);

//		do {
//			int num = (int)(Math.random() * 10) + 1;
//			System.out.println(num);
//			if(num == 7) break;
//		
////		}
//		}while(true);

		// 문제5번 161쪽 3번

		int cnt = 0;

//		int num1 = (int) (Math.random() * 6) + 1;
//		int num2 = (int) (Math.random() * 6) + 1;

//		while (num1+num2 !=5) {
//			num1 = (int) (Math.random() * 6) + 1;
//			num2 = (int) (Math.random() * 6) + 1;
//
//			System.out.printf("주사위1 :%d ,주사위2 :%d", num1, num2);
//			System.out.println();
//
//			cnt ++;
//
//		}
//		System.out.println("총 주사위 던진 횟수" + cnt);
		
		while(true) {
			int x =(int)(Math.random() * 6) + 1;
			int y =(int)(Math.random() * 6) + 1;
			cnt++;
			System.out.printf("주사위1 :%d ,주사위2 :%d", x, y);
			System.out.println();
			
			if(x + y ==5) {
				break;
			}
			
		}System.out.println("총 주사위 던진 횟수" + cnt);

	}

}
