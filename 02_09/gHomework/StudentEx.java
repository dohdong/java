package gHomework;

import java.util.*;

public class StudentEx {
	
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<Student>();
		
		String name;
		int tel;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i <3 ; i++ ) {
			System.out.print("학생의 이름을 입력하세요 : ");
			name = sc.nextLine();
			System.out.print("학생의 번호를 입려하세요 : ");
			tel = sc.nextInt();

			set.add(new Student(name,tel)); 
			
			sc.nextLine();
		}
		
		
		
		Iterator<Student> it4 = set.iterator();
		while (it4.hasNext())  	
		{
			Student st = it4.next();
			System.out.println("이름 : "+st.getName()+", 번호 :"+st.getTel());
		}
		
		
	}
}
