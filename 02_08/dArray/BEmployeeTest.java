package dArray;
import java.util.Scanner;

public class BEmployeeTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BEmployee[] list = new BEmployee[3];
		
		String name;
		String tel;
		long sal;
		double amt;

		for (int i =0 ; i<list.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = scan.nextLine();
			System.out.print("전화번호를 입려하세요 : ");
			tel = scan.next();
			System.out.print("연봉을 입력하세요 : ");
			sal = scan.nextLong();
			
			list[i] = new BEmployee(name, tel, sal);
			scan.nextLine();
		}
		
		for (int i =0 ; i<list.length; i++)
			list[i].print();
		
		for (BEmployee e : list) {
			e.print();
		}
	}

}