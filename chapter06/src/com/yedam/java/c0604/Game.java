package com.yedam.java.c0604;

public class Game {
	// 필드
	// 인스터느 필드
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;
	// static : 어디서든 사용할수 있게 만들어 주는것 대신 남발해서 사용하면 안됨
	// 생성자

	public Game() {

	}

	public Game(String id) {
		this.id = id;
	}

	public Game(String id,String passWd) {
		this.id =id;
		this.passWd =passWd;

	}

	// 메소드
	// 인스턴스 메소드
	void getInfo() {
		System.out.println(gameName);
		System.out.println("내 아이디 :"+id);
		System.out.println("내 비밀번호 :"+passWd);
	}
}
