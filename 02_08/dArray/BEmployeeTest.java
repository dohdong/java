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
			System.out.print("�̸��� �Է��ϼ��� : ");
			name = scan.nextLine();
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			tel = scan.next();
			System.out.print("������ �Է��ϼ��� : ");
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