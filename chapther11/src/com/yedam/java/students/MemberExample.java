package com.yedam.java.students;

import java.util.HashMap;

public class MemberExample {

	public static void main(String[] args) {
		HashMap<Student,String> hashmap = new HashMap<Student,String>();
		
		hashmap.put(new Student("1"),"95");
		
		String score = hashmap.get(new Student("1"));
		System.out.println("1번학생의 총점"+score);
		
		
	}

}
