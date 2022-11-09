package com.yedam.java.c0603;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.campany :"+ car1.company);
		System.out.println();
		
		Car car2 = new Car("지프");
		System.out.println("car2.campany :"+ car2.company);
		System.out.println("car2.campany :"+ car2.model);
		System.out.println();

		Car car3 = new Car("지프","카키");
		System.out.println("car3.campany :"+ car3.company);
		System.out.println("car3.campany :"+ car3.model);
		System.out.println("car3.campany :"+ car3.color);
		System.out.println();

		
		Car car4 = new Car("지프","카키",210);
		System.out.println("car4.campany :"+ car4.company);
		System.out.println("car4.campany :"+ car4.model);
		System.out.println("car4.campany :"+ car4.color);
		System.out.println("car4.campany :"+ car4.maxSpeed);
		System.out.println();


	}

}
