package cJDBC;

import java.beans.Statement;
import java.sql.*;
public class ConnectDatabase2 {

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
		}catch (SQLException e) {
			System.out.println("연결에 실패했습니다.");
		}
		

		
	}

}
