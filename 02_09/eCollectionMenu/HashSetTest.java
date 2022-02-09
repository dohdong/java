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
			System.out.println("1.회원 가입 \n2.회원탈퇴  \n3.회원출력 \n4.종료");
			System.out.print("메뉴를 선택 :");
			num = sc.nextInt();
			sc.nextLine();
			boolean flag = false;
			if(num == 1) {
				System.out.print("회원의 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("회원의 나이를 입려하세요 : ");
				age = sc.nextInt();
				Member m = new Member(name,age);
				if(!mset.add(m))
					System.out.println("같은 회원이 존재합니다.");
				
				
			}else if(num == 2) {
				System.out.print("삭제하려는 회원의 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("삭제하려는 회원의 나이를 입려하세요 : ");
				age = sc.nextInt();
				Member m = new Member(name,age);
				Iterator<Member> it = mset.iterator();
				while(it.hasNext()) {
					Member tm = it.next();
					if(m.equals(tm)) {
						it.remove();
						//mset.remove(tm);
						flag = true;
						System.out.println("삭제되었습니다.");
						break;
					}
				} 
				if(!flag) {
					System.out.println("해당 회원이 없습니다.");
				}
				
				
			}else if(num == 3) {
				Iterator<Member> it4 = mset.iterator();
				while (it4.hasNext())  	
				{
					Member mem = it4.next();
					System.out.println("이름 : "+mem.getName()+", 나이 :"+mem.getAge());
				}
				
				
				
			}else if(num == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}

}
