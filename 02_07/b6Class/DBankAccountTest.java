package b6Class;

import java.util.Scanner;

public class DBankAccountTest {


	public static void main(String[] args) {
		int amt;
		boolean run = true;
		DBankAccount myAccount = new DBankAccount();

		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1.예금 2.출금 3.잔액 4.종료");

			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.println("예금액 > ");
				myAccount.deposit(sc.nextInt());
				break;

			case 2 :
				System.out.println("출금액 > ");
				amt = sc.nextInt();
				myAccount.withdraw(amt);
				break;

			case 3 :
				System.out.println("잔고 > ");
				myAccount.print2();
				break;

			case 4 : 
				run = false;
				break;
			}
			System.out.println();

		}
		System.out.println("프로그램종료");

	}
}
