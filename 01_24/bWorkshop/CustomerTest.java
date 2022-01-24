package bWorkshop;


public class CustomerTest {

	public static void main(String[] args) {
		ICustomerBiz biz = new CustomerBiz();
		biz.initializeCustomer();
		int menu = 0;
		do {
		 printMenu();
		 System.out.print("## 메뉴 입력 :");
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
			 System.out.println("프로그램을 종료합니다. Bye~");
			 System.out.println("------------------------");
			 System.exit(0);
			 break;
		 default :
			 System.out.println("##없는 메뉴를 선택하셨습니다.!!");
		    }
		 }catch(NumberFormatException e) {
			 System.out.println("##숫자를 입력하세요!!");
		 }
		}while(menu!=9);

	}
	public static void printMenu() {
		System.out.println("== <<고객 관리 프로그램>> ==");
		System.out.println("1.전체 고객 정보 조회");
		System.out.println("2.고객 정보 추가");
		System.out.println("3.고객 정보 삭제");		 
		System.out.println("9.종료");
		System.out.println("========================");
	}

	}


