package b6Class;

import java.util.Scanner;

public class BRectangleTest {

	public static void main(String[] args) {
		BRectangle rc = new BRectangle();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로와 높이를 입력하세요 :  ");
		rc.w = scanner.nextInt();
		rc.h = scanner.nextInt();
		
		System.out.println("면적은 : " +rc.area());
		
	}

}

