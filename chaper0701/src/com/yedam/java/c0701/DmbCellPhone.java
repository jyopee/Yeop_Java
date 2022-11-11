package com.yedam.java.c0701;

public class DmbCellPhone extends CellPhone {

	
		//필드
		public int channel;
		
		//생성자
		public DmbCellPhone(String model,String color,int channel) {
			//부모 클래스
			this.model =model;
			this.color=color;
			//자식 클래스
			this.channel =channel;
		}
		
		//메소드
		
		void turnOnDumb () {
			System.out.println("체널"+channel+"을 수신합니다.");
		}
	

}
