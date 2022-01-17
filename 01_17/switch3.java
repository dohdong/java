import java.util.Scanner;


public class switch3 {
	////EX3> 점수(0~100)를 입력받습니다.입력받은 점수가 90~100이면 A 89~80이면 B, 79~70이면 C, 69~60이면 D, 59~0은 F
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("점수를 입력하세요 : " );	
		int num = input.nextInt();
		
		switch (num/10) {
		
		case 10 :
			System.out.println("A 입니다.");
			break;
		case 9 :
			System.out.println("A 입니다.");
			break;
		case 8 :
			System.out.println("B 입니다.");
			break;
		case 7 :
			System.out.println("C 입니다.");
			break;
		case 6 :
			System.out.println("D 입니다.");
			break;
		default :
			System.out.println("F 입니다.");
			break;
			
			
		}
		input.close(); 

	}
}
//로컬변수는 사용전에 반드시 초기화가 필요함, 
//String은 reference타입이므로 생성없이 선언만 해야 할경우 null을 할당합니다.


/*
import java.util.Scanner;

public class SwitchTest3 {
   public static void main(String[] args){
      System.out.print("1~100사이의 점수  입력");
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
            System.out.printf("점수 %1$3d는  학점%2$s\n",  jumsu, grade);
  }
}
*/
