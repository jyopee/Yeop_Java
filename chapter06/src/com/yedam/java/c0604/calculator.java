package com.yedam.java.c0604;

public class calculator {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	int plus(int x, int y) {

		int result = x + y;
		return result;

	}

	int minus(int x, int y) {

		int result = x - y;
		return result;

	}

	double multi(int x, int y) {

		double result = (double)x * (double)y;
		return result;

	}

	double divided(int x, int y) {

		double result = (double)x + (double)y;
		return result;

	}
	
	double avg(int x,int y) {
		int sum = plus(x,y);
		double result =sum /2.0;
		return result;
		
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	
	double areaRectangle(double width) {
		return width * width;
		
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
		
	}

}
