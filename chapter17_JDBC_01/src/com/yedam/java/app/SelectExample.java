package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) {
		try {
		// 1. JDBC Driver 로딩하기.
		Class.forName("org.sqlite.JDBC");
		
		// 2. DB 서버 접속하기
		String url = "jdbc:sqlite:/D:/DATABASE/TEST.database.db";
		Connection conn =DriverManager.getConnection(url);
		
		// 3. Statement or PreparedStatement 객체 생성하기
		Statement stmt = conn.createStatement();  // 데이터를 나를 객체
		
		// 4. SQL 실행
		ResultSet rs=stmt.executeQuery("SELECT student_id,student_name,student_dept FROM Student");
		// 5. 결과값 출력하기                             //예외 발생 가능한 코드
		while(rs.next()) {
			int sId = rs.getInt("student_id");
			String sName = rs.getString("student_name");
			String sDept = rs.getString("student_dept");
			System.out.println("=============================");
			System.out.println("아이디 : " + sId); 
			System.out.println("이름 : " + sName);
			System.out.println("학번 : " + sDept);
			
		}
		
		}catch(ClassNotFoundException  | SQLException e) {    // --예외 처리
			e.printStackTrace();
		}finally { 			// 6. 자원해제하기     -- 항상 실행
			if(rs != null) rs.close();
			if(stml != null) stmt.close();
			if(conn != null) conn.close();
		}

	}

}
