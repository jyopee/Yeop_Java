package com.yedam.java.washingMachine;

public class WashingExample {

	public static void main(String[] args) {
		washing(new LGWashingMachine());
	}
	
	public static void washing(WashingMachine wm) {
		wm.startBtn();
		System.out.println("세탁기 속도는"+wm.changeBtn(3));
		wm.stopBtn();
	}

}
