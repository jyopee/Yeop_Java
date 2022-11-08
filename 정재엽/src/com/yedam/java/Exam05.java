package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
	
		
		boolean run =true;
		int dice [] =null;
		int count =0;
		int selectNo;
		int diceNum = 0;
		int list [] = null;
//		int max =list[0];
//		int min =list[0];
//	
	
		Scanner input =new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println(" 1.주사위 크기 | 2.주사위 굴리기 | 3.결과 보기 | 4.가장 많이 나온 수 | 5.종료" );
			System.out.println("-----------------------------");
			System.out.print("메뉴 > ");
			
				selectNo = Integer.parseInt(input.nextLine());
			
			if ( selectNo == 1) {
				System.out.print("원하는 주사위 범위를 입력하세요 :");
				int size = Integer.parseInt(input.nextLine());
				dice = new int[size];
			}
			
			else if ( selectNo == 2) {
				
				int i;
				for(i=0; i<dice.length; i++ ) {
					diceNum = (int)(Math.random() * 6) + 1;
					System.out.println(diceNum);
					dice[i+1]=diceNum;
					
					
					if(diceNum == 5) {
						System.out.printf("5가 나올떄 까지 %d 번 돌렸습니다.",i);
						break;
					}
					
					
					
				}
				
			
				}
			
			else if (selectNo == 3) {
				
				list = new int[dice.length];
				for(int i=0; i < list.length; i++) {
					int index = dice[i]; 
					list[index]++;
				}
				
//				for(int i=0; i<dice.length; i++) {
//					System.out.println((i+1) +"은" +dice[i]);
//				}
				
				
				for(int i=0; i < 6 ; i++) 
				{
				
					System.out.printf("숫자 %d의 경우 %d번 중복되엇습니다.\n",(i+1),list[i+1]);
				
					}
					
				
				}
			
			
			else if (selectNo == 4) {
				
//				for(int i=0; i<list.length; i++) {
//					if (list[i] > max) {
//						max =list[i];
//					}
//					
//					if (list[i] < min) {
//						min =list[i];
//					}
//				
//				}
//				
//				System.out.println(max);
//				System.out.println(min);
				
				
			}
			
	
			else if (selectNo == 5) {
				run=false;
			}
			
			
					
	
					
				
	
			
			
			}
				
			
			
}

}
