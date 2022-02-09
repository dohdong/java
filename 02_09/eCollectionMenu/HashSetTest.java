package eCollectionMenu;

import java.util.*;

import dCollectionT.Member;



public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Member> mset = new HashSet<Member>();
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		int num;
		
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1.ȸ�� ���� \n2.ȸ��Ż��  \n3.ȸ����� \n4.����");
			System.out.print("�޴��� ���� :");
			num = sc.nextInt();
			sc.nextLine();
			boolean flag = false;
			if(num == 1) {
				System.out.print("ȸ���� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				System.out.print("ȸ���� ���̸� �Է��ϼ��� : ");
				age = sc.nextInt();
				Member m = new Member(name,age);
				if(!mset.add(m))
					System.out.println("���� ȸ���� �����մϴ�.");
				
				
			}else if(num == 2) {
				System.out.print("�����Ϸ��� ȸ���� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				System.out.print("�����Ϸ��� ȸ���� ���̸� �Է��ϼ��� : ");
				age = sc.nextInt();
				Member m = new Member(name,age);
				Iterator<Member> it = mset.iterator();
				while(it.hasNext()) {
					Member tm = it.next();
					if(m.equals(tm)) {
						it.remove();
						//mset.remove(tm);
						flag = true;
						System.out.println("�����Ǿ����ϴ�.");
						break;
					}
				} 
				if(!flag) {
					System.out.println("�ش� ȸ���� �����ϴ�.");
				}
				
				
			}else if(num == 3) {
				Iterator<Member> it4 = mset.iterator();
				while (it4.hasNext())  	
				{
					Member mem = it4.next();
					System.out.println("�̸� : "+mem.getName()+", ���� :"+mem.getAge());
				}
				
				
				
			}else if(num == 4) {
				break;
			}
		}
		System.out.println("���α׷� ����");
		
		
		
		
	}

}
