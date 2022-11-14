package com.yedam.java.member;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		//Object obj = new Member("blue"); -> Member obj = new Member("blue");
		
		if (id.equals(member.id)) {
			return true;
		}return false;
		}
}
