package cJDBC;

import java.sql.*;

public class StudentSelectTest  {

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
		
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		
		while (rs.next()) {
			System.out.print(rs.getString("SNAME")+" , ");
			System.out.print(rs.getString("SID")+" , ");
			System.out.print(rs.getString("DID"));
			System.out.println(" ");
		}
		rs.close();
		
		stmt.executeUpdate("insert into student(sname,sid, did) values('박성','1234','IT_01')");	
//		
//		
//		ResultSet rs2 = stmt.executeQuery("select * from student");
//		while (rs2.next()) {
//			System.out.print(rs2.getString("SNAME")+" , ");
//			System.out.print(rs2.getString("SID")+" , ");
//			System.out.print(rs2.getString("DID"));
//			System.out.println(" ");
//		}
//		rs2.close();
		
//		stmt.executeUpdate("delete from student where SID='111123'");
//		stmt.executeUpdate("delete from student where SID='1234'");
//		stmt.executeUpdate("delete from student where SID='11112'");
//		stmt.executeUpdate("delete from student where SID='980728'");
		
		
		stmt.close();
		con.close();
	}

}
