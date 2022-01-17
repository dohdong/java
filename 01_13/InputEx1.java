import java.util.Scanner;



public class InputEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("1~100사이의 정수 입력 : " ); // 입력된값은 정수열이므로
		int num = input.nextInt();				   // int로 변환해줌
		// 짝수/홀수 check 출력
		if (num%2 == 0 ){
			System.out.printf("%d은 짝수입니다.\n", num); 
			
			// form의 형태를 정해주는 출력방식..
			// 그래서 printf만 가능하고, 줄바꿈은 뒤에 \n으로 해줌.
			
			// System.out.printf("%1$3d은 짝수입니다.\n", num); 
			// 여기서 1$는 첫번째 argument, 3d는 3자리까지 표현. 
			
		}
		else {
			System.out.println(num+"는 홀수입니다.");
			
		}
		input.close(); 
	}

}

