package qWorkshop;


public class AccountTest {

	public static void main(String[] args) {
		System.out.println("[����] ���¸� �����մϴ�");

		Account h_account = new Account("CUST01", "ȫ�浿", "11-222-3333", 100000);
		h_account.printAccountInfo();
		System.out.println(" ");

		System.out.println("[�Ա�] 30000���� �Ա��մϴ�.");
		h_account.deposit(30000);
		h_account.printAccountInfo();
		System.out.println(" ");

		System.out.println("[�Ա�] -10000���� �Ա��մϴ�.");
		h_account.deposit(-10000);
		h_account.printAccountInfo();
		System.out.println(" ");

		System.out.println("[���] 50000���� ����մϴ�.");
		h_account.withdraw(50000);
		h_account.printAccountInfo();
		System.out.println(" ");
	}
}


