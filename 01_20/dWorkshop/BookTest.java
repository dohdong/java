package dWorkshop;


public class BookTest {

	public static void main(String[] args) {
		BookBiz biz = new BookBiz();

		int menu =0;

		do { printMenu();
		System.out.print("## �޴� �Է� :");
		menu = Integer.parseInt(BookUtil.getUserInput());
		switch(menu) {
		case 1 :  
			biz.printAllBooks();
			System.out.println("-----------------------------------------------------");
			break;
		case 2 :  
			biz.printAllMagazines();
			System.out.println("-----------------------------------------------------");
			break;			 
		case 3 :  
			biz.printAllNovels();
			System.out.println("-----------------------------------------------------");
			break;
		case 4 :  
			biz.printMagazineOneYearSubcription();
			System.out.println("-----------------------------------------------------");
			break;
		case 5 :  
			System.out.print("�˻��� ���ڸ��� �Է��ϼ��� : ");
			String authorName = BookUtil.getUserInput();
			biz.searchNovelByAuthor(authorName);
			System.out.println("-----------------------------------------------------");
			break;
		case 6 :  
			System.out.println("�ּҰ��� �Է��ϼ���");
			int min = Integer.parseInt(BookUtil.getUserInput());
			System.out.println("�ִ밪�� �Է��ϼ���");
			int max = Integer.parseInt(BookUtil.getUserInput());
			
			biz.searchNovelByPrice(min,max);
			System.out.println("-----------------------------------------------------");
			break;
			
			
			
			

		case 9 :
			System.out.println("------------------------");
			System.out.println("���α׷��� �����մϴ�. Bye~");
			System.out.println("------------------------");
			System.exit(0);
		default :
			System.out.println("�޴��� �߸� �Է��Ͽ����ϴ�.");
		}
		}while(menu!=9);

	}





	public static void printMenu() {
		System.out.println("====== < �޴� > ======");
		System.out.println("1.��ü ���� ���� ��ȸ");
		System.out.println("2.��ü ���� ��ȸ");
		System.out.println("3.��ü �Ҽ� ��ȸ");
		System.out.println("4.���� ���� ������ ��ȸ");
		System.out.println("5.�Ҽ� ���ڸ� �˻�");
		System.out.println("6.�Ҽ� ���� �˻�(�ּҰ� ~ �ִ밪)");
		
		System.out.println("9.����");
		System.out.println("======================");
	}

}


