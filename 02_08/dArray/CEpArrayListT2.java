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
			System.out.println("1.����߰� | 2.������� | 3.������ | 4.����");
			System.out.println("--------------------------------------");
			Scanner sc = new Scanner(System.in);
			
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch(menuNum) {
			case 1 :
				System.out.print("�߰��� ����� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				tel = sc.next();
				System.out.print("������ �Է��ϼ��� : ");
				sal = sc.nextLong();
				list.add(new BEmployee(name,tel,sal));
				break;
				
			case 2 :
				
				System.out.print("������ ����� �̸��� �Է��ϼ��� : ");
				dname = sc.nextLine();
				boolean a = false;
				
	            for(int i=0; i<list.size(); i++) {
	                if(dname.equals(list.get(i).name)) {
	                	 a = list.remove(list.get(i));
	                     break;
	                }
	            }
	            
				if ( a == false ) {
	            	System.out.println("�߸��Է��߽��ϴ�.");
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
		System.out.println("���α׷� ����");
	}
}