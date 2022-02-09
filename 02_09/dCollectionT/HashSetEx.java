package dCollectionT;

import java.util.*;


public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("이길동", 30));
		
		System.out.println("총 객체수 : "+set.size());
		
		
		Iterator<Member> it1 = set.iterator();
		while (it1.hasNext())  	
		{
			Member mem = it1.next();
			System.out.println("이름 : "+mem.getName()+", 나이 :"+mem.getAge());
		}


		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 이름을 입력 : ");
		String key = sc.next();
		Boolean flag = false;
		Iterator<Member> it2 = set.iterator();
		while(it2.hasNext()) {
			if(it2.next().getName().equals(key)) {
				System.out.println("찾는 데이터가 있다.");
				flag = true;
				break;
			}
		} 
		//if(!flag)
		if (flag == false) {
			System.out.println("찾는 데이터가 없다.");
		}
		
		flag = false;
		System.out.println("삭제하려는 이름을 입력 : ");
		String dname = sc.next();
		Iterator<Member> it3 = set.iterator();
		while(it3.hasNext()) {
			Member m = it3.next();
			if(m.getName().equals(dname)) {
				set.remove(m);
				System.out.println("삭제되었습니다..");
				flag = true;
				break;
			}
		} 
		if (flag == false) {
			System.out.println("찾는 데이터가 없다.");
		}
		Iterator<Member> it4 = set.iterator();
		while (it4.hasNext())  	
		{
			Member mem = it4.next();
			System.out.println("이름 : "+mem.getName()+", 나이 :"+mem.getAge());
		}
		
		

	}



}
