package com.yedam.java.tel;

public class MyClass {

	// 필드
	// 1)
	// public int a = 1;
	RemoteControl rc = new Television();

	// 생성자
	public MyClass() {

	}

	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();

	}

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		RemoteControl rc1 = new Television();
		rc1.turnOn();
		rc1.turnOff();
	}
}
