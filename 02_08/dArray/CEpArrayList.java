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
			System.out.println("1.����߰� | 2.������� | 3.������ | 4.����");
			System.out.println("--------------------------------------");
			

			Scanner sc = new Scanner(System.in);
			
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.print("�߰��� ����� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				list.add(name);
				break;
			case 2 :
				System.out.print("������ ����� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				list.remove(name);
				break;
			case 3 :
				System.out.println("������� �̸��� : " +list.toString());
				break;
			case 4 : 
				run = false;
				break;	
			}
		}
		System.out.println("���α׷� ����");
	}
}