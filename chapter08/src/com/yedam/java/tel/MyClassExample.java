package com.yedam.java.tel;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)------");
//		RomoteControl rc = new MyClass();
		MyClass mc = new MyClass();
		mc.rc.turnOn();
		mc.rc.turnOff();
		
		
		
		System.out.println("2)------");
		//RomoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		
		
		System.out.println("3)------");
		//RomoteControl rc = new Audio();
		MyClass mc3 = new MyClass(new Audio());
		mc3.methodA();
		
		
		
		
		System.out.println("4)------");
		//RomoteControl rc = new Audio();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
	}

}
