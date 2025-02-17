package kr.bit.model;
//JDBC ->myBatis, JPA
import java.sql.*;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	// 데이터베이스 연결객체 생성
	public void getConnect() {
		String URL="jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
		String user="root";
		String password="admin12345";
		
		// MySQL Driver Loading
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}// 동적 로딩
		
	}

}
