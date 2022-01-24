package bWorkshop;


public class CustomerTest {

	public static void main(String[] args) {
		ICustomerBiz biz = new CustomerBiz();
		biz.initializeCustomer();
		int menu = 0;
		do {
		 printMenu();
		 System.out.print("## �޴� �Է� :");
		 try {
		      menu = Integer.parseInt(CustomerUtil.getUserInput());
		 switch(menu) {
		 case 1 :  
			
			 biz.printAllCustomer();
			
			 break;
		 case 2 :  

			 biz.insertCustomer();

			 break;
		 case 3 :  

			 biz.deleteCustomer();

			 break;
		 case 9 :
			 System.out.println("------------------------");
			 System.out.println("���α׷��� �����մϴ�. Bye~");
			 System.out.println("------------------------");
			 System.exit(0);
			 break;
		 default :
			 System.out.println("##���� �޴��� �����ϼ̽��ϴ�.!!");
		    }
		 }catch(NumberFormatException e) {
			 System.out.println("##���ڸ� �Է��ϼ���!!");
		 }
		}while(menu!=9);

	}
	public static void printMenu() {
		System.out.println("== <<�� ���� ���α׷�>> ==");
		System.out.println("1.��ü �� ���� ��ȸ");
		System.out.println("2.�� ���� �߰�");
		System.out.println("3.�� ���� ����");		 
		System.out.println("9.����");
		System.out.println("========================");
	}

	}


