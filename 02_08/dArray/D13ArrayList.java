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
			System.out.println("1.ȸ���߰� | 2.ȸ������ | 3.ȸ����� | 4.����");
			System.out.println("--------------------------------------");
			
			boolean find = true;
			
			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.print("�߰��� ����� �̸��� �Է��ϼ��� : ");
				name = scan.nextLine();
				System.out.print("id�� �Է��ϼ��� : ");
				id = scan.nextLine();
				System.out.print("password�� �Է��ϼ��� : ");
				password = scan.nextLine();
				System.out.print("���̸� �Է��ϼ��� : ");
				age = scan.nextInt();
				list.add(new D13(name,id,password, age));
				scan.nextLine();
				break;
				
			case 2 :
				
				System.out.print("������ ����� �̸��� �Է��ϼ��� : ");
				String dname = scan.nextLine();

	            for(int i=0; i<list.size(); i++) {
	                if(list.get(i).getName().equals(dname) && find ) {
	                	 list.remove(i);
	                	 find = false;   // find=false �� ���� �����ϱ� ��� ���鼭 �Է��� �߸��Ǿ����ϴٵ� �����. 
	                	 				// ���� &&find �� ��� �ȴٰ� �մϴ�.
	                	 System.out.println("�����Ǿ����ϴ�");
	                     break;
	                }
	            }
	            
	            if(find) System.out.println("�Է��� �߸��Ǿ����ϴ�.");
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
		System.out.println("���α׷� ����");
	
		
	}

}
