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
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url,id,pwd);
			System.out.println("������ ���̽� ���� ����");
		}catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
			System.out.println("���ῡ �����߽��ϴ�.");
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
		
		stmt.executeUpdate("insert into student(sname,sid, did) values('�ڼ�','1234','IT_01')");	
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
