package com.yedam.java.c0601;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();  // 인스턴스 생성 
		System.out.println("최대 스피드는 :"+myCar.maxSpeed);
		System.out.println("색상 :"+myCar.color);
		myCar.run();
		
		Car myCar2 = new Car();
		System.out.println("최대 스피드는 :"+myCar2.maxSpeed);
		System.out.println("색상 :"+myCar2.color);
		
		if (myCar == myCar2) {                    // 서로 다른 존재임 (= new : 새로운거 생성 )
 			System.out.println("동일 객체 참조");
		}else {
			System.out.println("다른 객체 참조");
		}
		
		
	}

}
