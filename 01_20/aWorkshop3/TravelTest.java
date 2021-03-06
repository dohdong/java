package aWorkshop3;


//import aWorkshop3.TravelBiz;
//import aWorkshop3.TravelUtil;

public class TravelTest {

	public static void main(String[] args) {
		TravelBiz biz = new TravelBiz();
		int menu = 0;
		do {
		 printMenu();
		 System.out.print("## 메뉴 입력 :");
		 menu = Integer.parseInt(TravelUtil.getUserInput());
		 switch(menu) {
		 case 1 :  
			 biz.printTravelListTitle();
			 biz.printAllTravles();
			 System.out.println("-----------------------------------------------------");
			 break;
		 case 2 :  
			 biz.printTravelListTitle();
			 biz.printIndividualTravles();
			 System.out.println("-----------------------------------------------------");
			 break;			 
		 case 3 :  
			 biz.printTravelListTitle();
			 biz.printPackageTravels();
			 System.out.println("-----------------------------------------------------");
			 break;
		 case 4 :  
			 System.out.println("여행 상품을 예약합니다.");
			 System.out.print("여행 코드 입력 :");
			 String travelCode = TravelUtil.getUserInput();
			 System.out.print("예약 인원 입력 :");
			 int reserveCount  = Integer.parseInt(TravelUtil.getUserInput());
			 biz.reserveTravel(travelCode, reserveCount);
			 System.out.println("-----------------------------------------------------");
			 break;
		  
		 case 9 :
			 System.out.println("------------------------");
			 System.out.println("프로그램을 종료합니다. Bye~");
			 System.out.println("------------------------");
			 System.exit(0);
		default :
			System.out.println("메뉴를 잘못 입력하였습니다.");
		 }
		}while(menu!=9);

	}
	
	public static void printMenu() {
		System.out.println("====== < 메뉴 > ======");
		System.out.println("1.전체 여행 상품 조회");
		System.out.println("2.개발 자유여행 상품 조회");
		System.out.println("3.패키지여행 상품 조회");
		System.out.println("4.여행 상품 예약");
		System.out.println("9.종료");
		System.out.println("======================");
	}
}

