package com.yedam.java.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	// 데이터베이스 연결정보
	private String jdbcDriver = "org.sqlite.JDBC";
	private String jdbcUrl = "jdbc:sqlite:/D:/DATABASE/employee.db";
	// 각 메소드에서 공통적으로 사용하는 변수-> 필드
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;

	// 연결
	// 1. jdbc friver loading
	// 2. connection
	protected void connect() {
		try {
			Class.forName(jdbcDriver);
			
			conn = DriverManager.getConnection(jdbcUrl);
			
		} catch (ClassNotFoundException jdbcUrl) {
			System.out.println("JDBC DRIVER LOADING FAIL");

		} catch (SQLException e) {
			System.out.println("JDBC DRIVER CONNECTION FAIL");
		}
	}

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("정상적으로 해체되지 않았습니다.");
		}
	}

	// 연결 해제

}
