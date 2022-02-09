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
			System.out.println("1.회원 가입 \n2.회원탈퇴  \n3.회원출력 \n4.종료");
			System.out.print("메뉴를 선택 :");

			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 :
				System.out.print("회원의 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("회원의 나이를 입려하세요 : ");
				age = sc.nextInt();
				//set.add(new Member(name,age));  이거만 하면 그냥 저장만 됨
				
				if(!set.add(new Member(name,age)))
					System.out.println("같은 회원이 존재합니다.");   
				break;
				
			case 2 :
				boolean flag = false;
				System.out.println("삭제하려는 회원의 이름을 입력 : ");
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
					System.out.println("찾는 데이터가 없습니다.");
				}
				break;
				
				
			case 3 :
				Iterator<Member> it4 = set.iterator();
				while (it4.hasNext())  	
				{
					Member mem = it4.next();
					System.out.println("이름 : "+mem.getName()+", 나이 :"+mem.getAge());
				}
				break;
			
			
			case 4 : 
				run = false;
				break;	
			}
		}
		System.out.println("프로그램 종료");

	}
}
