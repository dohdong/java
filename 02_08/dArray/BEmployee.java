package dArray;

public class BEmployee {
	String name;
	String tel;
	long sal;
	
	
	BEmployee() {
		this("", "",0);
	}
	BEmployee(String name) {
		this(name,"",0);
	}
	BEmployee(String name, String tel) {
		this("name","tel",0);
	}
	BEmployee(String name, String tel, long sal) {
		this.name = name;
		this.tel = tel;
		this.sal = sal;
	}
	
	void upSalary(double amt) {
		sal = sal + (int)(sal*amt);
		print();
	}
	
	
	
	void print() {
		System.out.println("이름 : "+name+", 전화번호 : "+tel+", 연봉 : "+sal);
		
	}

}
