package cJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDept_Join {
	public static void main (String[] args) {
		//cmd에서 오라클 계정 연결되면 출력이 안됨!!
		// 1)Driver Manager 가  Connection을 설정
		// 2)Connection이 Statement 를 생성(SQL구문을 실행하는 인터페이스)
		// 3)Statement 가 query 를 실행(execute)
		String url = "jdbc:oracle:thin:@DESKTOP-37CQ08K:1521:XE";
		String id = "scott";
		String password = "tiger";
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver"); // oracle 드라이버 로드
			con = DriverManager.getConnection(url, id, password); // JDBC 연결
			System.out.println("DB 연결 완료");
			stmt = con.createStatement(); // SQL문 처리용 Statement 객체 생성				
			printTable(stmt);
			con.commit();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류");
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
			System.out.println("SQL 실행오류");
		} finally {
			try {
				if(rs != null) rs.close();
			} catch (Exception e) {  }

		}
	}
}
