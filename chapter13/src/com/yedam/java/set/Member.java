package com.yedam.java.set;

public class Member {

	public String name;
	public int age;

	public Member(String name,int age) {
		this.name = name;
		this.age =age;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		//Object obj = new Member("blue"); -> Member obj = new Member("blue");
		
		if (name.equals(member.name)) {
			return true;
		}return false;
		}
}
