package com.yedam.java.c0402;

public class CoditionalStatementSubject {
	public static void main(String[] args) {

		// for문

		// 1~10까지 출력
//		for(int i=1; i<11; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i=1; i<50; i++) {
//			System.out.println("메롱");
//			
//		}

//		int x =1;
//		for(; x<=100; x+=15) {
//			System.out.println("출력");
//		}
//		System.out.println("x :"+x);
//		
//		for(int i=0, j=100; i<=50 && j>=50; i++, j-- ) {
//			
//		}
//			
		// 1~100까지 출력, 동시에 1~100까지 합을 출력
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//			System.out.println("i");
//
//		}
//		System.out.println(sum);
//		
//		
//		for(float f=0.1f; f<=1.0f; f+=0.1f){
//			System.out.println(f);
//		}
//		
		// 구구단을 2~9단까지 출력
//		for (int i = 2; i <= 9; i++) {
//			System.out.println("==== " + i + "단 =====");
//			for (int j = 1; j <= 9; j++) {
//				int dan = i * j;
//				System.out.printf("%d * %d = %d", i, j, dan);
//				System.out.println();
//			}
//
//		}

//		int count = 1;
//		while (count <= 10) {
//			System.out.println(count);
//			count++;
//		}
//
//		System.out.println("==================================");
//
//		count = 0;
//		while (count <= 10) {
//			count++;
//			System.out.println(count);
//		}
//
//		// 1부터 100까지 출력,1부터 100까지 합을 출력
//		int sum = 0;
//		count = 1;
//		while (count <= 100) {
//
//			sum += count;
//			count++;
//
//		}
//		System.out.println(count - 1);
//		System.out.println(sum);

//		int index = 1;
//
//		while (index != 1) {
//			System.out.println("while 반복문이"+index+"번 실행");
//		}
//		
//		do {
//			System.out.println("do~while 반복문이"+index+"번 실행");
//		}while (index != 1);  //한번은 무조건 실행iwca5@
//		
//		while(true) {
//			int num =(int)(Math.random()*6)+1;
//			System.out.println(num);
//			if(num ==6) break;
//		}

		// 이중 for문에서 break문 사용
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");

		}
		System.out.println("2) 바깥쪽 for문 종료");

		System.out.println("=======================================");

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) { // 네이밍
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
			System.out.println("1) 안쪽 for문 종료");

		}
		System.out.println("2) 바깥쪽 for문 종료");

		// continue를 사용한 for문
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);

		}

		// continue를 사용한 for문
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);

		}
	}
}
