package b6Class;


public class DBankAccount {
	int accountNumber;
	String name;
	int balance;
	
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	void print2() {
		System.out.println("현재 잔액은 "+ balance + "입니다.");
	}
	
	
}
