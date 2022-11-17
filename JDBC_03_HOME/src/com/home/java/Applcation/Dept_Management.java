package com.home.java.Applcation;

import java.util.List;
import java.util.Scanner;


public class Dept_Management {
	Scanner sc = new Scanner(System.in);
	EmpDAO empDAO = EmpDAO1mpl.getInstance();

	public void EmpMangement() {
		while (true) {
			// 메뉴 출력
			menuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();

			menuPrint();
			// 각 메뉴의 기능을 실행
			if (menuNo == 1) { // 전체 조회
				selectAll();
			} else if (menuNo == 2) {// 단건 조회
				selectOne();
			} else if (menuNo == 3) {// 사원 등록
				insertEmp();
			} else if (menuNo == 4) {// 사원 수정
				updateEmp();
			} else if (menuNo == 5) {// 사원 삭제
				deleteEmp();
			} else if (menuNo == 9) {// 종료
				end();
			} else {
				printErrorMessage();
			} // 기타
		}
	}

	private void printErrorMessage() {
		System.out.println("===================");
		System.out.println("메뉴를 잘못 입력하였습니다.");
		System.out.println("메뉴를 다시 한번 확인해주세요.");
		System.out.println("===================");
	}

	private void end() {
		System.out.println("===================");
		System.out.println("프로그램을 종료합니다..");
		System.out.println("===================");
	}
	
	private void menuPrint() {
		System.out.println("===============================================");
		System.out.println("|1.  |2. |3.  |4.  |5.  |9. ");
		System.out.println("===============================================");
	}


	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구서오디어 잇습니다.");
		}
		return menuNo;
	}

	private void selectAll() {
		List<EmpVO> list = empDAO.SelectALL();

		if (list.isEmpty()) {
			System.out.println("정보가 없습니다.");
			return;
		}

		for (EmpVO empVO : list) {
			System.out.printf("%d : %s %s \n ", empVO.getEmpNo(), empVO.getDeptNo(), empVO.getFrom_data());

		}
	}

	private void selectOne() {
		EmpVO findEmp = inputEmpInfo();
		EmpVO empVO = empDAO.selectOne(findEmp);
		if (empVO == null) {
			System.out.printf("%d 사원번호 \n", findEmp.getEmpNo());
		} else {
			System.out.println("검색 결과 >");
			System.out.println(empVO);
		}
	}

	private void insertEmp() {
		EmpVO empVO = inputEmpALL();
		empDAO.insert(empVO);
	}

	private void updateEmp() {
		EmpVO empVO = inputEmpInfo();
		empDAO.insert(empVO);
	}
	
	private EmpVO inputEmpALL() {
		EmpVO empVO = new EmpVO();
		System.out.println("사원번호 >");
		empVO.setEmpNo(Integer.parseInt(sc.nextLine()));

		System.out.println("부서 번호 >");
		empVO.setDeptNo(sc.nextLine());

		System.out.println("입사일 >");
		empVO.setFrom_data(sc.nextLine());

		System.out.println("일 >");
		empVO.getTo_data(sc.nextLine());


		return null;
	}

	private com.home.java.Applcation.EmpVO inputEmpInfo() {
		EmpVO empVO = new EmpVO();
		System.out.println("사원번호 >");
		empVO.setEmpNo(Integer.parseInt(sc.nextLine()));

		System.out.println("부서 번호 >");
		empVO.setDeptNo(sc.nextLine());

		System.out.println("입사일 >");
		empVO.setFrom_data(sc.nextLine());

		System.out.println("일 >");
		empVO.getTo_data(sc.nextLine());

		return null;
	}

	private void deleteEmp() {
		int empNo = inputEmpNo();
		empDAO.delete(empNo);
	}

	private int inputEmpNo() {
		int empNo = 0;
		try {
			empNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("사원번호는 숫자로 구성되어 잇습니다.");
		}
		return empNo;
	}
}
