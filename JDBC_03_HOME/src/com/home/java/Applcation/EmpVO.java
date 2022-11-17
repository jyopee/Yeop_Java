package com.home.java.Applcation;

public class EmpVO {
	//메인 필드
	//캡슐화로 인해서 getter setter 필수
	
	private int empNo;
	private String deptNo;
	private String from_data;
	private String to_data;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getFrom_data() {
		return from_data;
	}
	public void setFrom_data(String from_data) {
		this.from_data = from_data;
	}
	public String getTo_data(String string) {
		return to_data;
	}
	public void setTo_data(String to_data) {
		this.to_data = to_data;
	}
	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", deptNo=" + deptNo + ", from_data=" + from_data + ", to_data=" + to_data
				+ "]";
	};
	
	
	
}
