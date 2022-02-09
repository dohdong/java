package dCollectionT;

import java.util.*;


public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("�̱浿", 30));
		
		System.out.println("�� ��ü�� : "+set.size());
		
		
		Iterator<Member> it1 = set.iterator();
		while (it1.hasNext())  	
		{
			Member mem = it1.next();
			System.out.println("�̸� : "+mem.getName()+", ���� :"+mem.getAge());
		}


		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� �̸��� �Է� : ");
		String key = sc.next();
		Boolean flag = false;
		Iterator<Member> it2 = set.iterator();
		while(it2.hasNext()) {
			if(it2.next().getName().equals(key)) {
				System.out.println("ã�� �����Ͱ� �ִ�.");
				flag = true;
				break;
			}
		} 
		//if(!flag)
		if (flag == false) {
			System.out.println("ã�� �����Ͱ� ����.");
		}
		
		flag = false;
		System.out.println("�����Ϸ��� �̸��� �Է� : ");
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
			System.out.println("ã�� �����Ͱ� ����.");
		}
		Iterator<Member> it4 = set.iterator();
		while (it4.hasNext())  	
		{
			Member mem = it4.next();
			System.out.println("�̸� : "+mem.getName()+", ���� :"+mem.getAge());
		}
		
		

	}



}
