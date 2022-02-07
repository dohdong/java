package b6Class;

public class AStudentEx {

	public static void main(String[] args) {  //아래와 같이 main을 만들줄 알아야한다...ㅠㅜ
		AStudent std = new AStudent();
		std.name = "kim";
		std.rollno = 20170582;
		std.age = 20;
		
		System.out.println("학생의 이름 : " + std.name);
		System.out.println("학생의 학번 : " + std.rollno);
		System.out.println("학생의 나이 : " + std.age);
		

	}

}
