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





// ���̽� 01_03 ���� ���̽㿡�� class�� ���� def�� Ȱ���ؼ� �ذ��� ������°� �ֱ��ϴ�.