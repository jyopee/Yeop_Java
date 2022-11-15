package com.yedam.java.member;

import com.yedam.java.Map.Student;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {

			Member member = (Member) obj;
		return member.name.equals(name) && (member.age ==age);
		
		}else {
			return false;
			
			if(obj instanceof Member) {
				Member member =(Member)obj;
				return (Member==Member.member) && (name.equals(Member.member));
			}else {
				return false;
			}
		}
		
	@Override 
	public int hashCode() {
			return name.hashCode()+age;
		}
	}

}
