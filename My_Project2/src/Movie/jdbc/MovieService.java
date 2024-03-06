package Movie.jdbc;

import java.sql.Connection;
import java.util.HashMap;

import Movie.Movie;

public class MovieService {
	
	public HashMap<Integer, Movie> MovieList(){
		Connection conn = JDBCTemplate.getConnection();
		HashMap<Integer, Movie> result = new MovieDao().MovieList(conn);
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public HashMap<Integer, Movie> ReserveList(){
		Connection conn = JDBCTemplate.getConnection();
		HashMap<Integer, Movie> result = new MovieDao().ReserveList(conn);
		
		JDBCTemplate.close(conn);
		
		return result;
	}
}
