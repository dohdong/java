package aCreate;

public class BankingTest {

	public static void main(String[] args) {
		BankAccount h_account = new BankAccount(10000);
		BankCustomer hong = new BankCustomer("0001", "ȫ�浿");
		hong.setAccount(h_account); //�����ڿ��� �ʱ�ȭ�� ���ؼ� ���⼭ �ʱ�ȭ�� ���־���Ѵ�.
		System.out.println(hong);
		
		if (h_account.deposit(1000)) {
			System.out.println("1000�� �Ա�: �Աݼ���");
		}else {
			System.out.println("1000�� �Ա�: �Աݽ���");
		}
		System.out.println(hong);

		
		if (h_account.deposit(5000)) {
			System.out.println("5000�� �Ա�: �Աݼ���");
		}else {
			System.out.println("5000�� �Ա�: �Աݽ���");
		}
		System.out.println(hong);
		
		
		if (h_account.deposit(7000)) {
			System.out.println("7000�� �Ա�: �Աݼ���");
		}else {
			System.out.println("7000�� �Ա�: �Աݽ���");
		}
		System.out.println(hong);

	}

}
