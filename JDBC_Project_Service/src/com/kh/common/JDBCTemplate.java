package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//공통 템플릿(매번 반복적으로 작성될 코드를 메소드로 정의)
public class JDBCTemplate {
	//모든 메소드 싹다 static 메소드
	//싱글톤 패턴 : 메모리 영역에 단 한번만 올려두고 매번 재사용하는 개념
	
	//1. Connection 객체 생성(DB접속) 후 해당 Connection객체 반환\
	public static Connection getConnection() {
	
		Connection conn = null;
		
		try {
			//1)JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2)Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	// 2. commit 처리해주는 메소드(Connection 객체 전달 받음)
	public static void commit(Connection conn) {
		try {
			if (conn != null && conn.isClosed()) {
				conn.commit();
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 3. rollback 처리해주는 메소드(Connection 객체 전달 받음)
	public static void rollback(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.rollback();
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//JDBC용 객체들을 전달받아서 반납처리해주는 메소드
	// 4. Statement 관련 객체를 전달받아서 반납시켜주는 메소드
	public static void close(Statement stmt) {
		try {
			if (stmt != null && stmt.isClosed()) {
				stmt.close();
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 5. rollback 처리해주는 메소드(Connection 객체 전달 받음)
	public static void close(Connection conn) {
		try {
			if (conn != null && conn.isClosed()) {
				conn.close();
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 6.
	public static void close(ResultSet rset) {
		try {
			if (rset != null && rset.isClosed()) {
				rset.close();
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
