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
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url,id,pwd);
			System.out.println("������ ���̽� ���� ����");
		}catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}catch (SQLException e) {
			System.out.println("���ῡ �����߽��ϴ�.");
		}
		

		
	}

}
