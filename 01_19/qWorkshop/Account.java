package qWorkshop;


public class Account {

	private String customerId;
	private String customerName;
	private String accountNumber;
	private int balance;
	
	public Account (String customerId , String customerName, String accountNumber, int balance ) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if (money<0) {
			System.out.println("����");
		}else if (balance < money ) {
			System.out.println("����");
		}else {
			balance -= money;
		}
	}
	
	public void deposit(int money) {
		if (money<0) {
			System.out.println("����");
		}else {
			balance += money;
		}
	}
	
	public void printAccountInfo() {
		System.out.println("==============");
		System.out.println("�� ��ȣ :" +customerId);
		System.out.println("�� �� :" +customerName);
		System.out.println("���� ��ȣ :" +accountNumber);
		System.out.println("�ܾ� :" +balance);
		System.out.println("==============");
		
	}
}
