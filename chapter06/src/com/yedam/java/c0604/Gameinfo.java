package com.yedam.java.c0604;

public class Gameinfo {

	public static void main(String[] args) {
	Game user1 = new Game();
	user1.id ="예담이";
	user1.passWd ="1234";
	
	Game user2 = new Game("예담이2");
	user2.passWd ="4321";
	
	Game user3 = new Game("에담이3","4567");
	
	user1.getInfo();
	user2.getInfo();
	user3.getInfo();
	
	System.out.println("=======static 호풀=======");
	
	//static (정적, 고정) 필드 사용
	System.out.println(Game.gameName);

	}

}
