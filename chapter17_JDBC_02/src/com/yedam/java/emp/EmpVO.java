package com.yedam.java.emp;

import java.util.Date;

public class EmpVO {
	// 캡슐화 시킬것(private)

	// field
	private int empNo; // 테이블에서 언더바를빼고, 카멜표기법으로 필드명을 만듬
	private String birthdate; // 테이블에서 가져올것이기에 import는 sql것을 가져온다
	private String firstName;
	private String lastName;
	private String gender;
	private String hireDate;

	public int getEmpNo() {
		return empNo;
		// employees의 한행(레코드)를 담을수 있는 정보를 필드로 선언
	}
	// 캡슐화되어있으니 getter/setter 필요

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", birthdate=" + birthdate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}


	

}
