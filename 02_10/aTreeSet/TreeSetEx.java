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
			System.out.println("1.회원 가입 \n2.회원 탈퇴  \n3.회원 출력 \n4.종료");
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
				
//				treeSet.add(new Member(name,age));  //이거만 하면 그냥 저장만 됨
				
//				if(!treeSet.add(new Member(name,age)))
//					System.out.println("같은 회원이 존재합니다.");   
				
				Member mem = new Member(name,age);
				if(treeSet.add(mem)) {
					System.out.println("회원가입이 완료되었습니다.");
				}else {
					System.out.println("이미 가입한 회원입니다.");
				}
				
				
				break;
				
			case 2 :
				boolean flag = false;
				System.out.println("삭제하려는 회원의 이름을 입력 : ");
				String dname = sc.next();
				Iterator<Member> it3 = treeSet.iterator();
				while(it3.hasNext()) {
					Member m = it3.next();
					if(m.getName().equals(dname)) {
						treeSet.remove(m);
						System.out.println("삭제되었습니다.");
						flag = true;
						break;
					}
				} 
				if (flag == false) {
					System.out.println("찾는 데이터가 없습니다.");
				}
				break;
				
				
			case 3 :
				Iterator<Member> it4 = treeSet.iterator();
				while (it4.hasNext())  	
				{
					Member mem2 = it4.next();
					System.out.println("이름 : "+mem2.getName()+", 나이 :"+mem2.getAge());
					System.out.println(mem2);
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
