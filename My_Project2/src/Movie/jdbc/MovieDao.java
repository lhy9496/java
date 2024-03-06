package Movie.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;

import Movie.Member;
import Movie.Movie;

public class MovieDao {
	
	Properties prop = new Properties();
	
	public MovieDao() {
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public HashMap<Integer, Movie> MovieList(Connection conn) {
		
		HashMap<Integer, Movie> map = new HashMap<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("MovieList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Movie m = new Movie();
				
				m.setTitle(rset.getString("title"));
				m.setGenre(rset.getString("genre"));
				m.setAccessAge(rset.getInt("accessage"));
				m.setTicket(rset.getInt("ticket"));
				
				map.put(rset.getInt("serial"), m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return map;
	}
	
	public HashMap<Integer, Movie> ReserveList(Connection conn) {
		
		HashMap<Integer, Movie> map = new HashMap<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("ReserveList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Movie m = new Movie();
				
				m.setTitle(rset.getString("title"));
				m.setGenre(rset.getString("genre"));
				m.setAccessAge(rset.getInt("accessage"));
				m.setTicket(rset.getInt("ticket"));
				
				map.put(rset.getInt("serial"), m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return map;
	}
}
