package b6Class;

public class Employee {
	String name;
	String tel;
	long sal;
	
	
	Employee() {
		this("", "",0);
	}
	Employee(String name) {
		this(name,"",0);
	}
	Employee(String name, String tel) {
		this("name","tel",0);
	}
	Employee(String name, String tel, long sal) {
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
