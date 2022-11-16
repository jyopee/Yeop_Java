package com.yedam.java.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class EmpDAOlmpl extends DAO implements EmpDAO {
	// DAO에 대해서는 싱글톤으로 진행할것
	// DAO에 관련해선 싱글톤이면된다? 충분하다? 그래야한다?
	// 여러개의 인스턴스로 만들 필요가 없기 때문
//	private static/*자기자신에 대해 정적인 필드 필요*/ EmpDAO instance /*인터페이스로 필드를 가질것?*/ = null;
	private static EmpDAO instance = null;

	public static EmpDAO getInstance() {
		if (instance == null) // 인스턴스가 생성된적이 없으면
			instance = new EmpDAOlmpl(); // 새로만든 인스턴스를 넘겨주고
		return instance; // 빈게 아니면 기존에 갖고있는걸 넘겨주겠다.
	}
	// 구현클래스는 철저하게 인터페이스의 구현클래스 역할을 할것

	@Override
	public List<EmpVO> selectAll() {
		List<EmpVO> list = new ArrayList<>();
		try {
			connect();// DB와의 연결
			// SQL문 실행
			// 매번 연결을 끊었다가 재연결하는이유는
			// SQL명령문 하나하나 사이에 대기시간이 얼마나 길지 모르기때문에.
			// 계속 Connection 유지하고있으면, 다른곳에서 연결을 못하기때문에
			// 손실이 큼. 그 손실을 잡아주기위해 한다고 보면 됨
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees";
			rs = stmt.executeQuery(sql); // sql문을 실행해서 활용 ?
			// 결과값이 담겼으니 while문으로 조회
			int count = 0;
			while (rs.next()/* 30만개는 너무 크니까, 객수를 세기에 제한을 두자. */) {
				EmpVO empVO = new EmpVO();
				empVO.setEmpNo(rs.getInt("emp_no"));
				empVO.setBirthdate(rs.getString("birth_date"));
				empVO.setFirstName(rs.getString("first_name"));
				empVO.setLastName(rs.getString("last_name"));
				empVO.setGender(rs.getString("gender"));
				empVO.setHireDate(rs.getString("hire_date"));
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
			/* 검색조건을 empNo를 쓸것이기 때문에 */

			String sql = "SELECT * FROM employees WHERE emp_no = " + empVO/* empVO가 값을 가지고 있는 상태이기에. */.getEmpNo();
			rs = stmt.executeQuery(sql);

			if (rs.next()/* 값이 존재하면 */) {
				findVO = new EmpVO();
				findVO.setEmpNo(rs.getInt("emp_no"));
				findVO.setBirthdate(rs.getString("birth_date"));
				findVO.setFirstName(rs.getString("first_name"));
				findVO.setLastName(rs.getString("last_name"));
				findVO.setGender(rs.getString("gender"));
				findVO.setHireDate(rs.getString("hire_date"));
			}
		} catch (Exception e) {

		} finally {
			disconnect();
		}
		return findVO;
	}

	@Override
	public void insert(EmpVO empVO) {
		try {
			connect();
			String sql = "INSERT INTO employees VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmpNo());
			pstmt.setString(2, empVO.getBirthdate());
			pstmt.setString(3, empVO.getFirstName());
			pstmt.setString(4, empVO.getLastName());
			pstmt.setString(5, empVO.getGender());
			pstmt.setString(6, empVO.getHireDate());
			// 여기까지는 SQL 문장을 보낼수있게 된것

			// 실행함
			int result = pstmt.executeUpdate();

			if (result > 0/* 몇갠진 몰라도 일단 등록되었다는것 */) {
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
	public void update(EmpVO empVO) {
		try {
			connect();
			String sql = /* first_name만 수정해보도록하자 */"UPDATE employees SET first_name = ? WHERE emp_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, /* 변경된 값은 매개변수가 갖고있다. */empVO.getFirstName());
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
			String sql = "DELETE FROM employees WHERE emp_no = " + empNo;

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
