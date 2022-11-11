package com.yedam.java.c0701;

public class Application {

	public static void main(String[] args) {
		
		Child child = new Child();
		Child2 child1 = new Child2();
		
		child1.getInfo();
		
//		child.lastName ="paul";
//		
//		//부모 클래스 필드
//		System.out.println(child.firstName +child.lastName);
//		
//		System.out.println(child.job);
//		
//		
//		
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰","화이트",10);
//		System.out.println("모델 :"+dmb.model);
//		System.out.println("모델 :"+dmb.color);
//		
//		System.out.println("채널 :"+dmb.channel);
//		
//		//부모 클래스 메소드 사용
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요. 저는 이탈리아 사람입닏.");
//		dmb.reciveVoice("반갑습니다. 정과장입니다.");
//		dmb.powerOff();
		
//		Member member = new Member("고길동","12341-4234234",1);
//		
//		System.out.println("name :"+member.name);
//		System.out.println("name :"+member.ssn);
//		System.out.println("memberNo :"+member.stdNo);
		
		Child cd = new Child();
		cd.method1();
		cd.method2();
		cd.method3();
		
		
		
		

	}

}
