package com.yedam.java.tire;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		System.out.println("##################");
		
		myCar.frontLeftTire = new MichelineTire();
		myCar.frontRightTire = new MichelineTire();

		
		myCar.run();
	}

}
