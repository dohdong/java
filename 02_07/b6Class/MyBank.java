package b6Class;
import java.util.Scanner;

public class MyBank {
	
	int accountNumber;
	String name;
	int balance;
	
	void deposit() {
		
		
		System.out.print("�Աݾ��� �Է��Ͻÿ� : ");
		Scanner scanner = new Scanner(System.in);
		balance = balance + scanner.nextInt();
		System.out.println("���� �ܾ��� "+balance);
	}
	
	void withdraw() {
		System.out.print("��ݾ��� �Է��Ͻÿ� : ");
		Scanner scanner = new Scanner(System.in);
		balance = balance - scanner.nextInt();
		System.out.println("���� �ܾ��� "+balance);
	}
	
	void print() {
		System.out.println("���� �ܾ��� "+balance);
		
	}

}
