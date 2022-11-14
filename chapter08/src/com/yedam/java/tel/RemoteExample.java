package com.yedam.java.tel;

public class RemoteExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		
//		rc = new Audio();
		
		rc.turnOn();
		rc.setVolum(11);
		rc.turnOff();
		
		Search search = new Television();
		
		search.search("naver.com");
		
		

		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolum(11);
		tv.turnOff();
		
		// 추상 클래스 vs 인터페이스
		// 추상 클래스(extends) -> 필드, 생성자,메소드
		// 인터페이스 -> 상속 푸상 메소드 내가 만들어 놓은 구현
	}

}
