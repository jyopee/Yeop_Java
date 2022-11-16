package com.yedam.java.emp;

import java.util.List;

public interface EmpDAO {
	//Employyes에 접근하는.
	// 해당테이블에 접근하는 테이블 메소드시그니처
	
	// 전체조회 (해당테이블이가진 모든 정보를 가져오는것)
	// return되는 값ㅇ ㅣ복수의 값을 가질 것
	List<EmpVO/*EmpVO라는 객체를 값으로 가질것*/> selectAll();
	
	// 단건조회
	// 반환되는것은 list 일 필요 없음
	EmpVO selectOne(EmpVO empVO/*여러가지 타입을 넘길수 있도록 하기위해, 타입에제한을 두지않음?*/);
	
	// 등록
	void insert(/*등록할때 모든정보가 필요하기때문에*/EmpVO empVO);
	
	// 수정
	void update(EmpVO empVO);
	
	// 삭제
	void delete(int empNo/*PK값으로 처리하는게 가장좋음*/);
}
