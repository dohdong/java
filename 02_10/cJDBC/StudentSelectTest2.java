package cJDBC;

import java.sql.*;

public class StudentSelectTest2 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@DESKTOP-37CQ08K:1521:XE";
		String id = "scott";
		String pwd = "tiger";
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url,id,pwd);
			System.out.println("데이터 베이스 연결 성공");
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			System.out.println("연결에 실패했습니다.");
		}
		//String str = "select * from student, dept where student.did = dept.did" ;
		
		Statement stmt = con.createStatement();
		//stmt.executeUpdate("insert into student(sname,sid, did) values('윤길동','900','IT_02')");	
		//stmt.executeUpdate("update student set Sname= 'lee' where SID= '100200' ");
		//stmt.executeUpdate("delete from student where Sname='lee'");
		//ResultSet rs = stmt.executeQuery("select * from student");
		ResultSet rs = stmt.executeQuery("select * from student, dept where student.did = dept.did");
		while (rs.next()) {
			System.out.print(rs.getString("SNAME")+" , "); //필드가 정수인 경우 : getInt("필드명") 
			System.out.print(rs.getString("SID")+" , ");
			System.out.print(rs.getString("DID")+" , ");
			System.out.print(rs.getString("Dname"));
			System.out.println(" ");
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
