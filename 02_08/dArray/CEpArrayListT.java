package dArray;
import java.util.ArrayList;
import java.util.Scanner;

public class CEpArrayListT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String tel;
		long sal;
		
		boolean run = true;
		
		ArrayList<CEmployee>list = new ArrayList<CEmployee>();
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.����߰� | 2.������� | 3.������ | 4.����");
			System.out.println("--------------------------------------");
			
			boolean find = true;
			
			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.print("�߰��� ����� �̸��� �Է��ϼ��� : ");
				name = scan.nextLine();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				tel = scan.next();
				System.out.print("������ �Է��ϼ��� : ");
				sal = scan.nextLong();
				list.add(new CEmployee(name,tel,sal));
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
				for (CEmployee e : list) {
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