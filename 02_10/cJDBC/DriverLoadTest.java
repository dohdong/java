package cJDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverLoadTest {
	public static void makeConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			
		}catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
			return;
		}
	}
	
	public static void main(String arg[]) throws SQLException {
		makeConnection();
	}
	
	
	
}
