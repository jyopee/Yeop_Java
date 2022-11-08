package com.yedam.java.c0504;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		Scanner input = new Scanner(System.in);
		
		int[] scores =null;
		int studentNum =0;
		
		int sum=0;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println(" 1.학생수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료" );
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(input.nextLine());
			
			
			switch(selectNo) {
			
			case 1:
				System.out.print("학생수 입력 :");
				studentNum = Integer.parseInt(input.nextLine());
				scores = new int[studentNum];
				break;
				
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("점수 입력 입력 :");
					int score = Integer.parseInt(input.nextLine());
					scores[i] =score;
					System.out.println("scores["+(i+1)+"]>"+scores[i]);
				}
				break;
				
			case 3:
				System.out.println("리스트 출력");
				
				for(int i=0; i<scores.length; i++) {
					System.out.printf("%d : %d\n",i+1,scores[i]);
			}
				break;
				
					
			case 4:
				int max =scores[0];
				int min =scores[0];
				
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
					
					}
					if (min > scores[i]) {
						min = scores[i];
					
					}
					
					
				}
				double avg = sum / scores.length;
				System.out.printf("총합 : %d 평균 : %.2f\n", sum, avg);

				System.out.printf("최댓값 :%d ,최솟값 :%d\n", max, min);
				break;
			
			case 5:
				run=false;
				
								
			
			}
		}
		System.out.println("종료되었습니다.");
	}

}
