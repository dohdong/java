package b6Class;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		Employee ep = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		ep.name  = sc.next();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		ep.tel = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		ep.sal = sc.nextLong();
		
		ep.print(); 
		*/
		
		
		Scanner scan = new Scanner(System.in);
		String name;
		String tel;
		long sal;
		double amt;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = scan.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		tel = scan.next();
		System.out.print("������ �Է��ϼ��� : ");
		sal = scan.nextLong();
		Employee em = new Employee(name,tel,sal);
		em.print();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		amt = sc1.nextDouble();
		em.upSalary(amt);
		
		
		
	}

}
