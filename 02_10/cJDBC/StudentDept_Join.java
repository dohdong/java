package cJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDept_Join {
	public static void main (String[] args) {
		//cmd���� ����Ŭ ���� ����Ǹ� ����� �ȵ�!!
		// 1)Driver Manager ��  Connection�� ����
		// 2)Connection�� Statement �� ����(SQL������ �����ϴ� �������̽�)
		// 3)Statement �� query �� ����(execute)
		String url = "jdbc:oracle:thin:@DESKTOP-37CQ08K:1521:XE";
		String id = "scott";
		String password = "tiger";
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver"); // oracle ����̹� �ε�
			con = DriverManager.getConnection(url, id, password); // JDBC ����
			System.out.println("DB ���� �Ϸ�");
			stmt = con.createStatement(); // SQL�� ó���� Statement ��ü ����				
			printTable(stmt);
			con.commit();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e) { }
		}
	}

	private static void printTable(Statement stmt) throws SQLException {
		String str = "select * from student, dept where student.did = dept.did ";
		ResultSet rs = stmt.executeQuery(str);
		try {
			while (rs.next()) {
				System.out.print(rs.getString("sid"));
				System.out.print("\t|\t" + rs.getString("sname"));
				System.out.print("\t|\t" + rs.getString("sid"));
				System.out.println("\t|\t" + rs.getString("did"));
			}
		} catch (SQLException e) {
			System.out.println("SQL �������");
		} finally {
			try {
				if(rs != null) rs.close();
			} catch (Exception e) {  }

		}
	}
}
