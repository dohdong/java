package b6Class;

import java.util.Scanner;

public class BRectangleTest {

	public static void main(String[] args) {
		BRectangle rc = new BRectangle();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ο� ���̸� �Է��ϼ��� :  ");
		rc.w = scanner.nextInt();
		rc.h = scanner.nextInt();
		
		System.out.println("������ : " +rc.area());
		
	}

}

