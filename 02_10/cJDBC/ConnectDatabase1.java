package cJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase1 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@DESKTOP-37CQ08K:1521:XE";
		String id = "scott";
		String pwd = "tiger";

		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			System.out.println("데이터베이스 연결 성공");

		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결에 실패했습니다.");
		}

	}

}
