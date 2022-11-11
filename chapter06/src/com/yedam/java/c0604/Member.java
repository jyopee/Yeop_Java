package com.yedam.java.c0604;

public class Member {

	// 필드
	// 생성자
	
	// 메소드
	
	// private String id;

	private String id;
	private String tel;
	private int age;
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("0보다 작은 나이가 저장되었습니다." + "다시 확인하세요");
			return;
		} else {
			this.age = age;
		}
	}

}
