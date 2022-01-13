import java.util.Scanner;




public class InputEx4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("년도를 입력하세요 : " );	
		int num = input.nextInt();	

		if (num % 4 == 0 ) {
			if (num % 400 == 0 ) {
				System.out.println("윤년 입니다.");
			}else if (num % 100 == 0 ) {
				System.out.println("평년 입니다.");
			}else {
				System.out.println("윤년 입니다.");
			}
		}else {
			System.out.println("평년 입니다.");
		}
		input.close(); 

	}
}