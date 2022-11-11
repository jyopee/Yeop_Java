package com.yedam.java.c0701;

public class CellPhone {

	
	public String model;
	public String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("나 :" +message);
	}
	
	void reciveVoice(String message) {
		System.out.println("상대방 :" +message);
	}
}
