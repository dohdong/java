package cCollection;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("이길동", 30));
		
		System.out.println("총 객체수 : "+set.size());
		

		Scanner scan = new Scanner(System.in);
		boolean check = false;

		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext())  	
		{
			Member mem = iterator.next();
			System.out.println("이름 : "+mem.getName()+", 나이 :"+mem.getAge());
		}


		System.out.println("찾는 이름을 입력 : ");
		String fname = scan.nextLine();
		Iterator<Member> iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			Member mem = iterator1.next();
			if(mem.getName().equals(fname)) {
				System.out.println("찾는 데이터가 있다."); 
				check = true;
				break;
			}
		}if (check == false)
			System.out.println("찾는 데이터가 없다.");

		boolean check2 = false;

		System.out.print("삭제하려는 이름 입력 : ");
		String dname = scan.nextLine();
		Iterator<Member> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Member mem = iterator2.next();
			if(mem.getName().equals(dname)) {
				set.remove(mem);				// 여기서 mem 이 아니라 dname 을 넣으면 삭제가 안됨.
				System.out.println("삭제완료");
				check2 = true;
				break;
			} 
		} 

		if(check2==false)
			System.out.println("잘못된 이름");
		
		for (Member mem : set) {
			System.out.println("이름 : "+mem.getName()+", 나이 :"+mem.getAge());
			
		}
		
		
	}
	
	
}