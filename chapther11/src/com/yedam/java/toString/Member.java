package com.yedam.java.toString;

public class Member {

	public String id;
	public String id1;
	public String id2;
	public String id3;
	public String id4;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		// Object obj = new Member("blue"); -> Member obj = new Member("blue");

		if (id.equals(member.id)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + "]";
	}

	
	
}
