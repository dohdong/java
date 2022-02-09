package eCollectionMenu;

import java.util.*;

import dCollectionT.Member;


public class HashSetMenu {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		String name;
		int age;
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.ȸ�� ���� \n2.ȸ��Ż��  \n3.ȸ����� \n4.����");
			System.out.print("�޴��� ���� :");

			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 :
				System.out.print("ȸ���� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				System.out.print("ȸ���� ���̸� �Է��ϼ��� : ");
				age = sc.nextInt();
				//set.add(new Member(name,age));  �̰Ÿ� �ϸ� �׳� ���常 ��
				
				if(!set.add(new Member(name,age)))
					System.out.println("���� ȸ���� �����մϴ�.");   
				break;
				
			case 2 :
				boolean flag = false;
				System.out.println("�����Ϸ��� ȸ���� �̸��� �Է� : ");
				String dname = sc.next();
				Iterator<Member> it3 = set.iterator();
				while(it3.hasNext()) {
					Member m = it3.next();
					if(m.getName().equals(dname)) {
						set.remove(m);
						System.out.println("�����Ǿ����ϴ�..");
						flag = true;
						break;
					}
				} 
				if (flag == false) {
					System.out.println("ã�� �����Ͱ� �����ϴ�.");
				}
				break;
				
				
			case 3 :
				Iterator<Member> it4 = set.iterator();
				while (it4.hasNext())  	
				{
					Member mem = it4.next();
					System.out.println("�̸� : "+mem.getName()+", ���� :"+mem.getAge());
				}
				break;
			
			
			case 4 : 
				run = false;
				break;	
			}
		}
		System.out.println("���α׷� ����");

	}
}
