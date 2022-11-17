package com.home.java.Applcation;

import java.util.ArrayList;
import java.util.List;

import com.home.java.common.DAO;

public class EmpDAO1mpl extends DAO implements EmpDAO {
	// 싱글톤 사용

	// static 사용이요 - 자기 자신에 대해 정적인 필요
	private static EmpDAO instance = null;

	public static EmpDAO getInstance() {
		if (instance == null)
			instance = new EmpDAO1mpl();
		return instance;
	}

	@Override
	public List<EmpVO> SelectALL() {
		List<EmpVO> list = new ArrayList<>();
		try {
			connect(); // DB 연결
			stmt = conn.createStatement();
			String sql = "SELECT * FROM dept_emp";
			rs = stmt.executeQuery(sql); // sql 쿼리문의 결과를 rs 변수에 담음
			int count = 0;
			while (rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setEmpNo(rs.getInt("emp_No"));
				empVO.setDeptNo(rs.getNString("dept_No"));
				empVO.setFrom_data(rs.getNString("from_data"));
				empVO.setTo_data(rs.getNString("to_data"));
				list.add(empVO);

				if (++count >= 20)
					break;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public EmpVO selectOne(EmpVO empVO) {
		EmpVO findVO = null;
		try {
			connect();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM dept_emp WHERE emp_no =" + empVO.getEmpNo();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				findVO = new EmpVO();
				findVO.setEmpNo(rs.getInt("emp_No"));
				findVO.setDeptNo(rs.getNString("dept_No"));
				findVO.setFrom_data(rs.getNString("from_data"));
				findVO.setTo_data(rs.getNString("to_data"));
			}

		} catch (Exception e) {

		} finally {
			disconnect();
		}
		return null;

	}

	@Override
	public void insert(EmpVO empVO) {
		try {
			connect(); // DB연결
			String sql = "INSERT INTO dept_emp VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmpNo());
			pstmt.setString(2, empVO.getDeptNo());
			pstmt.setString(3, empVO.getFrom_data());
			pstmt.setString(4, empVO.getTo_data());
			// sql 에 넣을 데이터를 변수로 가져옴
			int result = pstmt.executeUpdate();
			// 실행

			if (result > 0) { // 새로운 데이터가 존재할경우
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void update(EmpVO empVO) {
		// TODO Auto-generated method stub
		try {
			connect();
			String sql = "UPDATE dept_emp SET to_data = ? WHERE emp_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, /* 변경된 값은 매개변수가 갖고있다. */empVO.getTo_data());
			pstmt.setInt(2, empVO.getEmpNo());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delete(int empNo) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM dept_emp WHERE emp_no = " + empNo;
			int result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
