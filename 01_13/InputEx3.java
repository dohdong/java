import java.util.Scanner;




public class InputEx3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("������ �Է��ϼ��� : " );	
		int num = input.nextInt();
		if ( 100 >= num && num>= 90 ) {
			System.out.print("A �Դϴ�.");
		}else if (90>num && num >=80) {
			System.out.print("B �Դϴ�.");
		}else if (80>num && num >=70) {
			System.out.print("C �Դϴ�.");
		}else if (70>num && num >=60) {
			System.out.print("D �Դϴ�.");
		}else if (60>num && num >=0) {
			System.out.print("F �Դϴ�.");
		}else {
			System.out.print("�ùٸ��� ���� �����Դϴ�.");
		}
		input.close(); 


	}
}
