package dArray;

public class D13 {
	String name;
	String id;
	String password;
	int age;
	
	D13(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public String setName() {
		return name;
	}
	
	void print() {
		System.out.println("이름 : "+name+", id : "+id+", password : "+password+", 나이 : "+age);
		
	}
	
}
