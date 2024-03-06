package Movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class MovieJDBC {
	public HashMap<Integer, Movie> insertCinema() {
		HashMap<Integer, Movie> cinema = new HashMap<Integer, Movie>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT SERIAL, TITLE, GENRE_NAME, ACCESSAGE, TICKET FROM MOVIE JOIN GENRE ON (GENRE_CODE = GENRE_ID)";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				Movie m = new Movie();
				m.setTitle(rset.getString("title"));
				m.setGenre(rset.getString("genre_name"));
				m.setAccessAge(rset.getInt("accessage"));
				m.setTicket(rset.getInt("ticket"));
				
				cinema.put(rset.getInt("serial"), m);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return cinema;	
	}
}
