package a6;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-788910", "계백");
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//P1.ssn = "876543-876543";
		p1.name = "을지문덕";
		System.out.println(p1.name);
		
		
	}

}
