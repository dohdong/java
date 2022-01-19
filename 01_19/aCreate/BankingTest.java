package aCreate;

public class BankingTest {

	public static void main(String[] args) {
		BankAccount h_account = new BankAccount(10000);
		BankCustomer hong = new BankCustomer("0001", "홍길동");
		hong.setAccount(h_account); //생성자에서 초기화를 안해서 여기서 초기화를 해주어야한다.
		System.out.println(hong);
		
		if (h_account.deposit(1000)) {
			System.out.println("1000원 입금: 입금성공");
		}else {
			System.out.println("1000원 입금: 입금실패");
		}
		System.out.println(hong);

		
		if (h_account.deposit(5000)) {
			System.out.println("5000원 입금: 입금성공");
		}else {
			System.out.println("5000원 입금: 입금실패");
		}
		System.out.println(hong);
		
		
		if (h_account.deposit(7000)) {
			System.out.println("7000원 입금: 입금성공");
		}else {
			System.out.println("7000원 입금: 입금실패");
		}
		System.out.println(hong);

	}

}
