package aCreate;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;

	}

	public boolean deposit(int amount) {
		boolean flag = false;
		if (amount>0) {
			balance += amount;
			flag = true;
		}
		return flag;
	}

	public boolean withdraw(int amount) {
		boolean flag = false;
		if (amount>0 && balance > amount ) {
			balance += amount;
			flag = true;
		}
		return flag;
	}

}





// 파이썬 01_03 에는 파이썬에서 class를 만들어서 def를 활용해서 해결한 은행계좌가 있긴하다.