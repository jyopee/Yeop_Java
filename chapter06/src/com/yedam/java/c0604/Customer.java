package com.yedam.java.c0604;

public class Customer {
	
	String Name;
	String Bankname;
	int AccountNumber;
	double Money = 10000000;
	
	
	public Customer(String Name,String Bankname,int AccountNumber,int Money) {
		this.Name = Name;
		this.Bankname =Bankname;
		this.AccountNumber =AccountNumber ;
		this.Money = Money;
		
		
	}

	void getInfo() { // 입력한 정보 출력
		System.out.println("=== 입력하신 회원 정보 ===");
		System.out.println("이름 :"+Name);
		System.out.println("은행 :"+Bankname);
		System.out.println("계좌 :"+AccountNumber);
		System.out.println("잔액 :"+Money);
	

	}

	void withDraw() { // 출금할떄 정보를 출력
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 :"+ Money);
		System.out.println("금리 :"+ Bank.interestRate*100+"%");
		System.out.println("예상 금액 :"+((Money)+(Money*Bank.interestRate)));
		

	}
}
