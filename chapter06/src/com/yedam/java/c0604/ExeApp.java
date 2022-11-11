package com.yedam.java.c0604;

import java.util.Scanner;

public class ExeApp {
	Scanner input = new Scanner(System.in);
	Bankapp[] Bary = null;
	int menuNo;

	public ExeApp() {

		while (true) {
			
			showMenu();
			menuNo = Integer.parseInt(input.nextLine());

			switch (menuNo) {
			case 1:
				setSize();
				break;

			case 2:
				setInfo();
				break;

			case 3:
				break;

			case 4:
				showInfo();
				break;

			case 5:
				break;

			case 6:
				break;
			}//switch

		} // while

	} // </생성자>

	public void showMenu() {
		System.out.println("원하는 메뉴를 선택하세요");
		System.out.println("-----------------------------");
		System.out.println(" 1.회원수 입력 | 2.정보 입력 | 3.단건 조회 | 4.모두 조회 | 5.삭제 | 6.종료");
		System.out.println("-----------------------------");
	}// </메뉴선택>

	public void setSize() {
		System.out.print("회원수 > ..");
		int members = Integer.parseInt(input.nextLine());
		Bary = new Bankapp[members];
	}// </회원수 결정>

	public void showInfo() {

		for (int i = 0; i < Bary.length; i++) {
			Bary[i].getInfo();
		}
	} // </정보 열람>

	public void setInfo() {
		for (int i = 0; i < Bary.length; i++) {
			Bankapp bank = new Bankapp();
			System.out.print("고객 이름: ");
			String name = input.nextLine();
			bank.setName(name);

			System.out.print("은행 이름: ");
			String bankname = input.nextLine();
			bank.setBankname("bankname");

			System.out.print("계좌 번호: ");
			int account = Integer.parseInt(input.nextLine());
			bank.setAccountNumber(account);

			System.out.print("원금: ");
			int money = Integer.parseInt(input.nextLine());
			bank.setMoney(money);

			Bary[i] = bank;
		}

	} // </회원정보 입력>
}
