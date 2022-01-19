package qWorkshop;


public class AccountTest {

	public static void main(String[] args) {
		System.out.println("[공지] 계좌를 개설합니다");

		Account h_account = new Account("CUST01", "홍길동", "11-222-3333", 100000);
		h_account.printAccountInfo();
		System.out.println(" ");

		System.out.println("[입금] 30000원을 입금합니다.");
		h_account.deposit(30000);
		h_account.printAccountInfo();
		System.out.println(" ");

		System.out.println("[입금] -10000원을 입금합니다.");
		h_account.deposit(-10000);
		h_account.printAccountInfo();
		System.out.println(" ");

		System.out.println("[출금] 50000원을 출금합니다.");
		h_account.withdraw(50000);
		h_account.printAccountInfo();
		System.out.println(" ");
	}
}


