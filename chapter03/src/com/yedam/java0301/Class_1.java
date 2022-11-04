package com.yedam.java0301;

public class Class_1 {

	public static void main(String[] args) {

		int a = -100;
		int result1 = +a;
		int result2 = -a;

		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);

		byte b = 100;
		byte result3 = (byte) -b; // 강제 타입 변환
		int result_3 = -b;
		System.out.println("result3 :" + result_3);

		int x = 10;
		int y = 10;

		System.out.println("---------------------------------");
		x++;
		++x;
		System.out.println("x =" + x);

		System.out.println("---------------------------------");
		y--;
		--y;
		System.out.println("y =" + y);

		System.out.println("---------------------------------");
		int z = x++;
		System.out.println("z= " + z); // 12
		System.out.println("x= " + x); // 13

		System.out.println("---------------------------------");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x); // 13
		System.out.println("---------------------------------");
		z = ++x + y++;
		System.out.println("z= " + z); // 23
		System.out.println("x= " + x); // 15
		System.out.println("x= " + x); // 9

		System.out.println("---------------------------------");

		x = 5;
		y = 5;
		z = x++ + --y;

		System.out.println("z= " + z); // 9
		System.out.println("x= " + x); // 6
		System.out.println("x= " + y); // 4 틀려버렸땅

		System.out.println("---------------------------------");

		z = --x + y++;

		System.out.println("z= " + z); // 9
		System.out.println("x= " + x); // 5
		System.out.println("x= " + y); // 5

		System.out.println("---------------------------------");
		// 논리 부정 연산자

		boolean play = true;
		System.out.println(play);

		play = !play;
		System.out.println(play);

		boolean isOpen = true;

		if (!isOpen) {
			System.out.println("영업시간이 종료되엇습니다.");
		} else {
			System.out.println("영업 중입니다.");
		}

		int v1 = 5;
		int v2 = 2;
		int result;

		result = v1 + v2;
		System.out.println("result :" + result);

		result = v1 - v2;
		System.out.println("result :" + result);

		result = v1 * v2;
		System.out.println("result :" + result);

		result = v1 / v2;
		System.out.println("result :" + result);

		result = v1 % v2;
		System.out.println("result :" + result);

		// 비교연산자

		int num1 = 10;
		int num2 = 10;
		boolean bResult;

		bResult = (num1 <= num2);
		System.out.println(">= :" + bResult);

		bResult = (num1 == num2);
		System.out.println("== :" + bResult);
		bResult = (num1 != num2);
		System.out.println("!= :" + bResult);

		char char1 = 'A';
		char char2 = 'B';
		System.out.println("문자 비교 :" + (char1 > char2));

		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double :" + (v3 == v4));

		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double :" + (v5 == (float) v6)); // 정밀도가 틀려서 false가뜸

		// 논리 연산자

		int charCode = 'A';

		// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자

		if ((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문");
		}

		// 유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자");
		}

		// 유니코드 중 48보다 크고 57보다 작으면 0~9
		if ((charCode > 48) && (charCode < 57)) {
			System.out.println("0~9");

		}

		int numValue = 6;
		if ((numValue % 2 == 0) || (numValue % 3 == 0)) {
			System.out.println("2또는 3의 배수군요");
		}
		// 복합 대입 연산자

		System.out.println("=====================================");
		int resultA = 0;

		
		
		resultA += 10; 						// resultA=resultA+10; 10
		System.out.println("+= :" + resultA);
		resultA -= 5; 						// resultA=resultA-5; 5
		System.out.println("-= :" + resultA);
		resultA *= 3; 						// resultA=resultA*3; 15
		System.out.println("*= :" + resultA);
		resultA /= 5; 						// resultA=resultA/5; 3
		System.out.println("/= :" + resultA);
		resultA %= 3; 						// resultA=resultA%3; 0
		System.out.println("%= :" + resultA);

		//삼항 연산자
		System.out.println("=====================================");
		
		int score =95;
		char grade = score >= 90 ?'A' : 'B' ;
		System.out.printf("성적은 %d이고 등급은 %c 입니다.\n",score,grade);
		
		int age =10;
		String message =(age >=20)? "성인" : "미성년";
		System.out.printf("나이는 %d살이며 %s입니다.", age,message);

		
	}

}
