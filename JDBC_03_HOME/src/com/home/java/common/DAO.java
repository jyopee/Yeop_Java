package com.home.java.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	// 데이터 베이스 연결 정보
	private String jdbcDriver = "org.sqlite.JDBC";
	private String jdbcUrl = "jdbc:sqlite:D:/DataBase/employees.db";

	// 각종 메소드에서 공통적으로 사용하는 변수(필드)

	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;

	protected void connect() { // 연결
		try {
			Class.forName(jdbcDriver); // jdbc driver loading
			conn = DriverManager.getConnection(jdbcUrl); // connection
		} catch (ClassNotFoundException jdbcUrl) {
			System.out.println("JDBC DRIVER LOADING FAIL");
		} catch (SQLException e) {
			System.out.println("JDBC DRIVER CONNECTION FAIL");
		}
	}

	public void disconnect() {
		try {
			if (rs != null) rs.close();
			if (stmt != null) rs.close();
			if (pstmt != null) rs.close();
			if (conn != null) rs.close();
		} catch (SQLException e) {
			System.out.println("정상적으로 해체되지 않았습니다.");
		}
	}
}
