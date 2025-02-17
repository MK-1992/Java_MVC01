package kr.bit.model;
//JDBC ->myBatis, JPA
import java.sql.*;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	// 데이터베이스 연결객체 생성
	public void getConnect() {
		//데이터베이스 접속 URL
		String URL="jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
		String user="root";
		String password="admin12345";
		
		// MySQL Driver Loading
		try {
			// 동적 로딩(실행시점에서 객체를 생성하는 방법)
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//회원저장 동작
	public int memberInsert(MemberVO vo) {
		//                                                          ?=파라메터 1 2 3 4 5 6
		String SQL="insert into member(id,pass,name,age,email,phone) values(?,?,?,?,?,?)";
		getConnect();
		// sql문장을 전송하는 객체 생성
		int cnt=-1;
		try {
			ps=conn.prepareStatement(SQL); // 미리 컴파일을 시킨다.(미리 해놔야 속도 up)
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPass());
			ps.setString(3, vo.getName());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getEmail());
			ps.setString(6, vo.getPhone());
			
			// 성공=1 실패=0
			cnt=ps.executeUpdate(); //전송(실행)
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
