package com.yedam.java.c0603;

public class MainExample {

	public static void main(String[] args) {
		Car newCar = new Car("모닝", " 하늘색");

		System.out.println("제조 회사:" + newCar.company);
		System.out.println("모델:" + newCar.model);
		System.out.println("색상:" + newCar.color);
		
		System.out.println("===============================");

		Car myCar = new Car();                 //클래스에 하나의 생성자만 있을경우 메인에서 한번만 생성 가능

		System.out.println("제조 회사:" + myCar.company);
		System.out.println("모델:" + myCar.model);
		System.out.println("색상:" + myCar.color);
		
		Car subCar = new Car("아이오닉","하얀색"); //클래스에 하나의 생성자만 있을경우 메인에서 한번만 생성 가능

		System.out.println("제조 회사:" + subCar.company);
		System.out.println("모델:" + subCar.model);
		System.out.println("색상:" + subCar.color);
		
		
		
		

	}

}
