package aTreeSet;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Member> treeSet = new TreeSet<Member>();
		
		String name;
		int age;
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.ȸ�� ���� \n2.ȸ�� Ż��  \n3.ȸ�� ��� \n4.����");
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
				
//				treeSet.add(new Member(name,age));  //�̰Ÿ� �ϸ� �׳� ���常 ��
				
//				if(!treeSet.add(new Member(name,age)))
//					System.out.println("���� ȸ���� �����մϴ�.");   
				
				Member mem = new Member(name,age);
				if(treeSet.add(mem)) {
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				}else {
					System.out.println("�̹� ������ ȸ���Դϴ�.");
				}
				
				
				break;
				
			case 2 :
				boolean flag = false;
				System.out.println("�����Ϸ��� ȸ���� �̸��� �Է� : ");
				String dname = sc.next();
				Iterator<Member> it3 = treeSet.iterator();
				while(it3.hasNext()) {
					Member m = it3.next();
					if(m.getName().equals(dname)) {
						treeSet.remove(m);
						System.out.println("�����Ǿ����ϴ�.");
						flag = true;
						break;
					}
				} 
				if (flag == false) {
					System.out.println("ã�� �����Ͱ� �����ϴ�.");
				}
				break;
				
				
			case 3 :
				Iterator<Member> it4 = treeSet.iterator();
				while (it4.hasNext())  	
				{
					Member mem2 = it4.next();
					System.out.println("�̸� : "+mem2.getName()+", ���� :"+mem2.getAge());
					System.out.println(mem2);
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
