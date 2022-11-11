package com.yedam.java.c0604;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// 배열 크기 만큼 반복문을 실행
		// 회원 정보를 객체 담아서 배열의 크기 설
		System.out.print("학생수 > ..");
		int members = Integer.parseInt(input.nextLine());
		Student[] Arry = new Student[members];
		
		for(int i=0; i<Arry.length; i++) {
			
			Student arry = new Student();
			System.out.print("학생 이름: ");
			String name = input.nextLine();
			arry.setStname(name);
			
			System.out.print("학년: ");
			String code = input.nextLine();
			arry.setStcode(code);
			
			System.out.print("국어 성적: ");
			int Kor =Integer.parseInt(input.nextLine());
			arry.setKor(Kor);

			System.out.print("국어 성적: ");
			int Eng =Integer.parseInt(input.nextLine());
			arry.setEng(Eng);
			
			System.out.print("국어 성적: ");
			int Mat =Integer.parseInt(input.nextLine());
			arry.setMat(Mat);
			
			
			Arry[i] = arry;
			
		} 
		
//		for(int j=0; j<Arry.length; j++) {
//			System.out.println(Arry[j]+Arry.getStname());
			
//		}
		
		
		
		
		
	}

}
