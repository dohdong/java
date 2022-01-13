import java.util.Scanner;




public class InputEx3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("점수를 입력하세요 : " );	
		int num = input.nextInt();
		if ( 100 >= num && num>= 90 ) {
			System.out.println("A 입니다.");
		}else if (90>num && num >=80) {
			System.out.println("B 입니다.");
		}else if (80>num && num >=70) {
			System.out.println("C 입니다.");
		}else if (70>num && num >=60) {
			System.out.println("D 입니다.");
		}else if (60>num && num >=0) {
			System.out.println("F 입니다.");
		}else {
			System.out.println("올바르지 않은 성적입니다.");
		}
		input.close(); 


	}
}
