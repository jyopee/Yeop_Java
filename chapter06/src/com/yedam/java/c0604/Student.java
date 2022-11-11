package com.yedam.java.c0604;

public class Student {
	// 필드

	// 학생의 이름
	private String Stname;
	// 학년
	private String Stcode;
	// 국어, 영어 수학 성적
	private int kor;
	private int eng;
	private int mat;

	// 생성자 : 생성자를 통해서 모든 데이터를 입력

	public String getStname() {
		return Stname;
	}

	public void setStname(String stname) {
		Stname = stname;
	}

	public String getStcode() {
		return Stcode;
	}

	public void setStcode(String stcode) {
		Stcode = stcode;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	// 메소드
	public void print() {
		System.out.println();
	}

}

// 1) 각 필드를 저장할수 있는 getter, setter 작성
// 2) 모든 정보를 출력 할 웃 있는 메소드 하나 장소
// 3) school 클래스를 만들고 main을 작성해서 학생 정보를 넣는 프로그램
// 4) 학생수를 입력 받고, 각 필드의 데이터를 받아서 학생 정보가 담기 프로그램
// 5) 모든 학생의 정보를 출력
