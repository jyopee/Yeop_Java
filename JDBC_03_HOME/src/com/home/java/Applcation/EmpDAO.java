package com.home.java.Applcation;

import java.util.List;

public interface EmpDAO {
	//Main
	
	//1)전체 조회
	List<EmpVO>SelectALL();	
	
	//2)단건 조회
	EmpVO selectOne(EmpVO empVO);
	
	//3)등록
	void insert(EmpVO empVO);
	
	//4)수정
	void update(EmpVO empVO);
	
	void delete(int empNo);
}
