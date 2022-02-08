package dArray;

import java.util.ArrayList;
import java.util.Scanner;

public class D13ArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String id;
		String password;
		int age;
		
		boolean run = true;
		
		ArrayList<D13>list = new ArrayList<D13>();
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.회원추가 | 2.회원삭제 | 3.회원출력 | 4.종료");
			System.out.println("--------------------------------------");
			
			boolean find = true;
			
			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.print("추가할 사원의 이름을 입력하세요 : ");
				name = scan.nextLine();
				System.out.print("id를 입려하세요 : ");
				id = scan.nextLine();
				System.out.print("password을 입력하세요 : ");
				password = scan.nextLine();
				System.out.print("나이를 입력하세요 : ");
				age = scan.nextInt();
				list.add(new D13(name,id,password, age));
				scan.nextLine();
				break;
				
			case 2 :
				
				System.out.print("삭제할 사원의 이름을 입력하세요 : ");
				String dname = scan.nextLine();

	            for(int i=0; i<list.size(); i++) {
	                if(list.get(i).getName().equals(dname) && find ) {
	                	 list.remove(i);
	                	 find = false;   // find=false 를 쓰지 않으니까 계속 돌면서 입력이 잘못되었습니다도 출력함. 
	                	 				// 위에 &&find 는 없어도 된다고 합니다.
	                	 System.out.println("삭제되었습니다");
	                     break;
	                }
	            }
	            
	            if(find) System.out.println("입력이 잘못되었습니다.");
				break;
				
			case 3 :
				for (D13 d : list) {
					d.print();
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
