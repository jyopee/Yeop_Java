package com.yedam.java.tel;

public interface RemoteControl {

	// 상수
	// public static final PI =3.14
	// 추상 메소드
	// public void method();

	// 기본 설계도
	// 대규모 프로젝트 -> 번역
	//  A :영어 -> 한글 (메소드 :번역)
	//	B :영어 -> 일본어 (메소드 : method1())
	//	C :영어 -> 중국어 (메소드 : method2())
	
	//프로젝트 완료
	//똑같은 메소드 이름으로 구현
	
	//public static final int MAX_VOLUME =10;
	
	public int MAX_VOLUME =11;
	public int MIN_VOLUME =0;
	
	//추상 메소드
	//public abstract void turnOn();
	public void turnOn();
	public void turnOff();
	public void setVolum(int volum);
}
