package dArray;

import java.util.ArrayList;
import java.util.Scanner;

public class CEpArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String tel;
		long sal;
		boolean run = true;
		
		ArrayList<String>list = new ArrayList<String>();
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.사원추가 | 2.사원삭제 | 3.사원출력 | 4.종료");
			System.out.println("--------------------------------------");
			

			Scanner sc = new Scanner(System.in);
			
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.print("추가할 사원의 이름을 입력하세요 : ");
				name = sc.nextLine();
				list.add(name);
				break;
			case 2 :
				System.out.print("삭제할 사원의 이름을 입력하세요 : ");
				name = sc.nextLine();
				list.remove(name);
				break;
			case 3 :
				System.out.println("사원들의 이름은 : " +list.toString());
				break;
			case 4 : 
				run = false;
				break;	
			}
		}
		System.out.println("프로그램 종료");
	}
}