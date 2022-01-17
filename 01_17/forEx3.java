import java.util.Scanner;

public class forEx3  {
	//Ex3> 정수를 입력받고 , 약수들과  약수들의 합을 출력하시오

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print(" 정수 입력 : " ); // 입력된값은 정수열이므로
		int num = input.nextInt();	
		int sum = 0 ;
		for (int i = 1 ; i<=num; i++ ) {
			
			if (num%i == 0 ) {
				System.out.print(i+",");
				sum = sum + i ;
			}
			
		}
		input.close(); 

		System.out.print(sum);
		
	} 
}