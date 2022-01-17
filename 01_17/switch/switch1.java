import java.util.Scanner;



public class switch1  {
	//사용자로부터 1~100사이의 정수를 입력받습니다.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("1~100사이의 정수 입력 : " ); 
		int num = input.nextInt();
		
		switch(num%2) {
		case 0  : 
			System.out.printf("%d은 짝수입니다.\n", num); 
			break;
		case 1 :
			System.out.println(num+"는 홀수입니다.");
			break;
		

		}
		input.close();
	}
}

