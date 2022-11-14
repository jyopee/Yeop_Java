package com.yedam.java.students;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	public boolean equals(Object obj) {
		Student student =(Student)obj;
		
		if(studentNum.equals(student.studentNum)) {
			return true;
		}return false;
		
	}
	
	
}
