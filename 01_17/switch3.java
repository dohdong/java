import java.util.Scanner;


public class switch3 {
	////EX3> ����(0~100)�� �Է¹޽��ϴ�.�Է¹��� ������ 90~100�̸� A 89~80�̸� B, 79~70�̸� C, 69~60�̸� D, 59~0�� F
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("������ �Է��ϼ��� : " );	
		int num = input.nextInt();
		
		switch (num/10) {
		
		case 10 :
			System.out.println("A �Դϴ�.");
			break;
		case 9 :
			System.out.println("A �Դϴ�.");
			break;
		case 8 :
			System.out.println("B �Դϴ�.");
			break;
		case 7 :
			System.out.println("C �Դϴ�.");
			break;
		case 6 :
			System.out.println("D �Դϴ�.");
			break;
		default :
			System.out.println("F �Դϴ�.");
			break;
			
			
		}
		input.close(); 

	}
}
//���ú����� ������� �ݵ�� �ʱ�ȭ�� �ʿ���, 
//String�� referenceŸ���̹Ƿ� �������� ���� �ؾ� �Ұ�� null�� �Ҵ��մϴ�.


/*
import java.util.Scanner;

public class SwitchTest3 {
   public static void main(String[] args){
      System.out.print("1~100������ ����  �Է�");
      Scanner input = new Scanner(System.in);
      int jumsu = input.nextInt();
      String grade=null;
      switch (num/10 ) {	 
           case 10 :    
           case 9 :     grade = "A"; break;     
           case 8 :     grade = "B"; break; 
           case 7 :     grade = "C"; break; 
           case 6 :     grade = "D"; break; 
           default :   grade = "F";
     }//switch end
            System.out.printf("���� %1$3d��  ����%2$s\n",  jumsu, grade);
  }
}
*/
