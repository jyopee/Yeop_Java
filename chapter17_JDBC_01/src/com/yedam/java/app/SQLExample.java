package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// 1.JDBC Driver 로딩
			Class.forName("org.sqlite.JDBC");
			// 2. DBMS 서버와 접속하기
			String url = "jdbc:sqlite:/D:/DATABASE/TEST.database.db";
			conn = DriverManager.getConnection(url);
			
			//***********************INSERT******************************
			// 3. Statement or PrepareStatement 객체 생성하기
			String insert ="INSERT INTO Student (student_id,student_name) VALUES(?,?)";
			ps = conn.prepareStatement(insert);
			ps.setInt(1,110);
			ps.setString(2,"김형준");
			// 4. SQL 실행하기
			int result = ps.executeUpdate();
			// 5. 결과 출력하기
			System.out.println("insert 결과 :" + result);
			//***********************SELECT******************************
			// 3. Statement or PrepareStatement 객체 생성하기
			stmt = conn.createStatement();
			// 4. SQL 실행하기
			String select ="Select student_id,student_name,student_dept From Student";
			rs = stmt.executeQuery(select);
			// 5. 결과 출력하기
			while(rs.next()) {
				int id = rs.getInt("student_id"); 
				String name	= rs.getString("student_name");
				String dept	= rs.getString("student_dept");
				
				System.out.printf("학번 :%d 이름 :%s 학년 :%s\n",id,name,dept);
			}
//			***********************UPDATE******************************
//			 3. Statement or PrepareStatement 객체 생성하기
			String update = "UPDATE student SET student_dept = ? WHERE student_id =?";
					ps = conn.prepareStatement(update);
					ps.setInt(2,110);
					ps.setString(1,"3학년");
			
			// 4. SQL 실행하기
					result = ps.executeUpdate();
			// 5. 결과 출력하기
					System.out.println("update 결과: "+result);
			//***********************DELETE******************************
			// 3. Statement or PrepareStatement 객체 생성하기
					stmt = conn.createStatement();
			// 4. SQL 실행하기
					String delete="DELETE FROM Student Where student_id ="+2201;
					//출력결과 :DELETE FROM students WHERE student_id =2201
					result = stmt.executeUpdate(delete);
			// 5. 결과 출력하기
					System.out.println("delete 결과 : "+result);
			
			
		}catch (ClassNotFoundException e) {
			System.out.println("JDBC Drier Loading Fail");
		}
		catch ( SQLException e) {
			System.out.println("SQL관련 예외 :" +e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally { 	// 6. 자원해제하기 ******* (중요)
			try {
			if( rs != null) rs.close();
			if( stmt != null) stmt.close();
			if( ps != null) ps.close();
			if( conn != null) conn.close();
			
			
			}catch(SQLException e){
				System.out.println("정상적으로 해체되지 않았습니다.");
			}
		}
		

	}

}
