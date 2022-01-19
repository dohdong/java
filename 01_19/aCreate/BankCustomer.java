package aCreate;

public class BankCustomer {
	private String ssn;
	private String name;
	private BankAccount account;

	public BankCustomer(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;

	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;

	}

	public String toString() {
		return name+"님의 현재 잔액 : "+account.getBalance()+"원 입니다." ;
	}

	
	
}
