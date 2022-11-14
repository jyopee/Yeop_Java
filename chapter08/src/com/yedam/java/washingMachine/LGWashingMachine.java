package com.yedam.java.washingMachine;

public class LGWashingMachine implements WashingMachine{

	@Override
	public void startBtn() {
		System.out.println("세탁기가 세탁을 시작합니다.");
		
	}

	@Override
	public void pauseBtn() {
		System.out.println("세탁기가 세탁을 일시정지합니다.");
		
	}

	@Override
	public void stopBtn() {
		System.out.println("세탁기가 세탁을 정지합니다.");
		
	}

	@Override
	public int changeBtn(int speed) {
		switch(speed) {
		case 1: 
			return 20;
			
		case 2: 
			return 30;
			
		case 3: 
			return 40;
			
		case 4: 
			return 50;
		}
		return 0;
	}

}
