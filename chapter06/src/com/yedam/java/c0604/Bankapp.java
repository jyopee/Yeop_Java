package com.yedam.java.c0604;

public class Bankapp {

	private String Name;
	private String Bankname;
	private int AccountNumber;
	private double Money = 10000000;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		Bankname = bankname;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getMoney() {
		return Money;
	}

	public void setMoney(double money) {
		Money = money;
	}

	void getInfo() { // 입력한 정보 출력
		System.out.println("=== 입력하신 회원 정보 ===");
		System.out.println("이름 :" + Name);
		System.out.println("은행 :" + Bankname);
		System.out.println("계좌 :" + AccountNumber);
		System.out.println("잔액 :" + Money);

	}

	void withDraw() { // 출금할떄 정보를 출력
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 :" + Money);
		System.out.println("금리 :" + "%");
		System.out.println("예상 금액 :" + ((Money) + (Money * 0.3)));

	}
}
