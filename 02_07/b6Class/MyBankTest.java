package b6Class;
import java.util.Scanner;
public class MyBankTest {

	public static void main(String[] args) {

		boolean run = true;
		MyBank ba = new MyBank();

		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("1.예금 2.출금 3.잔액 4.종료");

			int menuNum = scanner.nextInt();
			switch(menuNum) {
			case 1 :
				ba.deposit();
				break;
			case 2 :
				ba.withdraw();
				break;
			case 3 :
				ba.print();
				break;
			case 4 : 
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}

