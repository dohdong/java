package b6Class;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		Employee ep = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		ep.name  = sc.next();
		System.out.print("전화번호를 입력하세요 : ");
		ep.tel = sc.next();
		System.out.print("연봉을 입력하세요 : ");
		ep.sal = sc.nextLong();
		
		ep.print(); 
		*/
		
		
		Scanner scan = new Scanner(System.in);
		String name;
		String tel;
		long sal;
		double amt;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.print("전화번호를 입려하세요 : ");
		tel = scan.next();
		System.out.print("연봉을 입력하세요 : ");
		sal = scan.nextLong();
		Employee em = new Employee(name,tel,sal);
		em.print();
		
		System.out.print("이름을 입력하세요 : ");
		amt = sc1.nextDouble();
		em.upSalary(amt);
		
		
		
	}

}
