package com.yedam.java.c0604;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//은행 고객 정보를 관리하는 클래스
		//1. main 2. Customer 3.Bank
		//main -> 생성자를 통한 고개그이 정보를 저장,출력
		//bank -> 해당은해으이 금리를 저장 
		//(현재 잔액 + (현재잔액 * 금리)
		//3. custuner -> 고개그이 정보를 저장
		//이름,은행명 ,계좌 <잔액의 필드
		//getinfo : 입력한 정보 출력
		//withdraw : 출금할떄 정보를 출력
		
		Scanner sc = new Scanner(System.in);
		String confirm;
		
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();
		
		customer.withDraw();
		
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		if(confirm.toLowerCase().equals("y")) {
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}
		
		Acces access = new Acces();
		
		access.free ="public";
		access.free();
		
//		access.privacy ="privacy";
		
		access.parent="parent";
		
		access.basic="basic";
//		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		
		
	}

}
