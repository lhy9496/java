package Movie.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;

import Movie.Movie;

public class MovieDao {
	
	Properties prop = new Properties();
	
	public MovieDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
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
	
	public HashMap<Integer, Movie> searchTitle(Connection conn, String title) {
		
		HashMap<Integer, Movie> map = new HashMap<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("searchTitle");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			
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
	
	public HashMap<Integer, Movie> searchGenre(Connection conn, String genre) {
		
		HashMap<Integer, Movie> map = new HashMap<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("searchGenre");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, genre);
			
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
	
	public HashMap<Integer, Movie> searchAge(Connection conn, int age) {
		
		HashMap<Integer, Movie> map = new HashMap<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("searchAge");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, age);
			
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
	
	public Movie checkMovie(Connection conn, int serial) {
		
		Movie m = new Movie();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("checkMovie");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, serial);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
								
				m.setTitle(rset.getString("title"));
				m.setGenre(rset.getString("genre"));
				m.setAccessAge(rset.getInt("accessage"));
				m.setTicket(rset.getInt("ticket"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return m;
	}

	public int reserveTicket1(Connection conn, int serial, Movie m, int ticket) {
		
		int result = 0;
		
		if (m.getTicket() < ticket) {
			return result;
		}
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("reserveTicket1");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, m.getTicket() - ticket);
			pstmt.setInt(2, serial);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int reserveTicket2(Connection conn, int serial, Movie m, int ticket) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("reserveTicket2");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, serial);
			pstmt.setString(2, m.getTitle());
			pstmt.setString(3, m.getGenre());
			pstmt.setInt(4, m.getAccessAge());
			pstmt.setInt(5, ticket);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public Movie checkReserve(Connection conn, int serial) {
		
		Movie r = new Movie();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("checkReserve");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, serial);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
								
				r.setTitle(rset.getString("title"));
				r.setGenre(rset.getString("genre"));
				r.setAccessAge(rset.getInt("accessage"));
				r.setTicket(rset.getInt("ticket"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return r;
	}
	
	public int reserveCancel1(Connection conn, int serial) {
		int result = 0;
		
		PreparedStatement pstmt = null;

		String sql = prop.getProperty("reserveCancel1");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, serial);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int reserveCancel2(Connection conn, int serial, Movie m, Movie r) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("reserveCancel2");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, m.getTicket() + r.getTicket());
			pstmt.setInt(2, serial);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
