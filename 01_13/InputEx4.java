import java.util.Scanner;




public class InputEx4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("�⵵�� �Է��ϼ��� : " );	
		int num = input.nextInt();	

		if (num % 4 == 0 ) {
			if (num % 400 == 0 ) {
				System.out.println("���� �Դϴ�.");
			}else if (num % 100 == 0 ) {
				System.out.println("��� �Դϴ�.");
			}else {
				System.out.println("���� �Դϴ�.");
			}
		}else {
			System.out.println("��� �Դϴ�.");
		}
		input.close(); 

	}
}