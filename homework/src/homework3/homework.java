package homework3;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run =true;
		int balance =0;
		int money=0;
		Scanner input =new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료" );
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(input.nextLine());
			
			switch(selectNo) {
			
			case 1:
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("원하시는 예금액 기입해주세요");
				money = Integer.parseInt(input.nextLine());
				balance += money;
				System.out.printf("예금 > %d / 잔액 > %d\n",money,balance);
				continue;
				
			case 2:
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("원하시는 출금액 기입해주세요");
				money = Integer.parseInt(input.nextLine());
				balance -= money;
				System.out.printf("출금 > %d / 잔액 > %d\n",money,balance);
				continue;
			
			case 3:
				System.out.println("잔고 확인을 선택하셨습니다.");
				System.out.println("잔고 >\n" +  balance);
				continue;
				
			case 4: 
				run = false;
			}
			System.out.println("종료되었습니다.");
			
		}
		
	
	
	}

}
