package b6Class;
import java.util.Scanner;

public class MyBank {
	
	int accountNumber;
	String name;
	int balance;
	
	void deposit() {
		
		
		System.out.print("입금액을 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		balance = balance + scanner.nextInt();
		System.out.println("현재 잔액은 "+balance);
	}
	
	void withdraw() {
		System.out.print("출금액을 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		balance = balance - scanner.nextInt();
		System.out.println("현재 잔액은 "+balance);
	}
	
	void print() {
		System.out.println("현재 잔액은 "+balance);
		
	}

}
