package cCollection;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("�̱浿", 30));
		
		System.out.println("�� ��ü�� : "+set.size());
		

		Scanner scan = new Scanner(System.in);
		boolean check = false;

		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext())  	
		{
			Member mem = iterator.next();
			System.out.println("�̸� : "+mem.getName()+", ���� :"+mem.getAge());
		}


		System.out.println("ã�� �̸��� �Է� : ");
		String fname = scan.nextLine();
		Iterator<Member> iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			Member mem = iterator1.next();
			if(mem.getName().equals(fname)) {
				System.out.println("ã�� �����Ͱ� �ִ�."); 
				check = true;
				break;
			}
		}if (check == false)
			System.out.println("ã�� �����Ͱ� ����.");

		boolean check2 = false;

		System.out.print("�����Ϸ��� �̸� �Է� : ");
		String dname = scan.nextLine();
		Iterator<Member> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Member mem = iterator2.next();
			if(mem.getName().equals(dname)) {
				set.remove(mem);				// ���⼭ mem �� �ƴ϶� dname �� ������ ������ �ȵ�.
				System.out.println("�����Ϸ�");
				check2 = true;
				break;
			} 
		} 

		if(check2==false)
			System.out.println("�߸��� �̸�");
		
		for (Member mem : set) {
			System.out.println("�̸� : "+mem.getName()+", ���� :"+mem.getAge());
			
		}
		
		
	}
	
	
}