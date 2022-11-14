package com.yedam.java.member;

import java.util.HashMap;

import com.yedam.java.key.key;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등");
		} else {
			System.out.println("obj1과 obj2는 같지 않음");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj2는 동등");
		} else {
			System.out.println("obj1과 obj2는 같지 않음");
		}
		
		HashMap<Member, String> member = new HashMap<>();
		//new Member("1") -> 주소가 "1"의 10이고,해쉬 코드1
		member.put(new Member("1"),"홍길동");
		String value = member.get(new Member("1"));
		
		
		System.out.println(value);
	}

}
