package dArray;
import java.util.ArrayList;
import java.util.Scanner;

public class CEpArrayListT2 {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		String name;
		String tel;
		long sal;
		String dname;
		boolean run = true;
		
		ArrayList<BEmployee>list = new ArrayList<BEmployee>();
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.사원추가 | 2.사원삭제 | 3.사원출력 | 4.종료");
			System.out.println("--------------------------------------");
			Scanner sc = new Scanner(System.in);
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch(menuNum) {
			case 1 :
				System.out.print("추가할 사원의 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("전화번호를 입려하세요 : ");
				tel = sc.next();
				System.out.print("연봉을 입력하세요 : ");
				sal = sc.nextLong();
				list.add(new BEmployee(name,tel,sal));
				break;
				
			case 2 :
				
				System.out.print("삭제할 사원의 이름을 입력하세요 : ");
				dname = sc.nextLine();
				boolean a = false;
				
	            for(int i=0; i<list.size(); i++) {
	                if(dname.equals(list.get(i).name)) {
	                	 a = list.remove(list.get(i));
	                     break;
	                }
	            }
	            
				if ( a == false ) {
	            	System.out.println("잘못입력했습니다.");
	            }
				break;
				
			case 3 :
				for (BEmployee e : list) {
					e.print();
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