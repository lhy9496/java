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
	
	public HashMap<Integer, Movie> searchTitle(String title){
		Connection conn = JDBCTemplate.getConnection();
		HashMap<Integer, Movie> result = new MovieDao().searchTitle(conn, title);
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public HashMap<Integer, Movie> searchGenre(String genre){
		Connection conn = JDBCTemplate.getConnection();
		HashMap<Integer, Movie> result = new MovieDao().searchGenre(conn, genre);
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public HashMap<Integer, Movie> searchAge(int age){
		Connection conn = JDBCTemplate.getConnection();
		HashMap<Integer, Movie> result = new MovieDao().searchAge(conn, age);
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public Movie checkMovie(int serial) {
		Connection conn = JDBCTemplate.getConnection();
		Movie m = new MovieDao().checkMovie(conn, serial);
		
		JDBCTemplate.close(conn);
		
		return m;
	}
	
	public Movie checkReserve(int serial) {
		Connection conn = JDBCTemplate.getConnection();
		Movie m = new MovieDao().checkReserve(conn, serial);
		
		JDBCTemplate.close(conn);
		
		return m;
	}
	

	public int reserveTicket(int serial, Movie m, int ticket) {
		Connection conn = JDBCTemplate.getConnection();
		int result1 = 0, result2 = 0;
		result1 = new MovieDao().reserveTicket1(conn, serial, m, ticket);
		if (result1 > 0) {
			result2 = new MovieDao().reserveTicket2(conn, serial, m, ticket);
		}
		JDBCTemplate.close(conn);
		
		return result2;
	}
	
	public int reserveCancel(int serial) {
		int result = 0;
		
		Connection conn = JDBCTemplate.getConnection();
		
		Movie m = new MovieDao().checkMovie(conn, serial);
		Movie r = new MovieDao().checkReserve(conn, serial);
		if (r == null) {
			return result;
		}
		
		result = new MovieDao().reserveCancel1(conn, serial);
		if (result > 0) {
			result = new MovieDao().reserveCancel2(conn, serial, m, r);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}




}
