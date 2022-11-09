package com.yedam.java.c0602;

class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("제작회사 :" +myCar.company);
		System.out.println("제작회사 :" +myCar.model);
		System.out.println("제작회사 :" +myCar.color);
		System.out.println("최고속도 :" +myCar.maxSpeed);
		System.out.println("현재속도 :" +myCar.speed);
		
		myCar.speed =60;
		
		System.out.println("현재속도 :" +myCar.speed);
		
		Car newCar = new Car();
		
		System.out.println("현재속도 :" +newCar.speed);
		
		String str = new String("con");
		
		
		
	}

}
