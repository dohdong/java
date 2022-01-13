import java.util.Scanner;



public class InputEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("1~100사이의 정수 입력 : " );
		int num = input.nextInt();
		// 짝수/홀수 check 출력
		if (num%2 == 0 ){
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
			
		}
		input.close(); 
	}

}

