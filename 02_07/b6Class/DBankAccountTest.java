package b6Class;

import java.util.Scanner;

public class DBankAccountTest {


	public static void main(String[] args) {
		int amt;
		boolean run = true;
		DBankAccount myAccount = new DBankAccount();

		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1.���� 2.��� 3.�ܾ� 4.����");

			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.println("���ݾ� > ");
				myAccount.deposit(sc.nextInt());
				break;

			case 2 :
				System.out.println("��ݾ� > ");
				amt = sc.nextInt();
				myAccount.withdraw(amt);
				break;

			case 3 :
				System.out.println("�ܰ� > ");
				myAccount.print2();
				break;

			case 4 : 
				run = false;
				break;
			}
			System.out.println();

		}
		System.out.println("���α׷�����");

	}
}
