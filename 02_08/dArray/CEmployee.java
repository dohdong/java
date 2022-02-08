package dArray;

public class CEmployee {
	private String name;
	private String tel;
	private long sal;
	
	
	CEmployee() {
		this("", "",0);
	}
	CEmployee(String name) {
		this(name,"",0);
	}
	CEmployee(String name, String tel) {
		this("name","tel",0);
	}
	CEmployee(String name, String tel, long sal) {
		this.name = name;
		this.tel = tel;
		this.sal = sal;
	}
	
	void upSalary(double amt) {
		sal = sal + (int)(sal*amt);
		print();
	}
	
	public String getName() {
		return name;
	}
	
	public String setName() {
		return name;
	}

	
	
	void print() {
		System.out.println("이름 : "+name+", 전화번호 : "+tel+", 연봉 : "+sal);
		
	}

}