package com.yedam.java.tire;

public class Car {

	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire BackleftTire = new NexonTire();
	Tire BackRightTire = new NexonTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackleftTire.roll();
		BackRightTire.roll();
	}
}
