import java.util.Scanner;



public class InputEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("1~100������ ���� �Է� : " );
		int num = input.nextInt();
		// ¦��/Ȧ�� check ���
		if (num%2 == 0 ){
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
			
		}
		input.close(); 
	}

}

