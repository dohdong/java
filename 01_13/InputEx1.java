import java.util.Scanner;



public class InputEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("1~100������ ���� �Է� : " ); // �ԷµȰ��� �������̹Ƿ�
		int num = input.nextInt();				   // int�� ��ȯ����
		// ¦��/Ȧ�� check ���
		if (num%2 == 0 ){
			System.out.printf("%d�� ¦���Դϴ�.\n", num); 
			
			// form�� ���¸� �����ִ� ��¹��..
			// �׷��� printf�� �����ϰ�, �ٹٲ��� �ڿ� \n���� ����.
			
			// System.out.printf("%1$3d�� ¦���Դϴ�.\n", num); 
			// ���⼭ 1$�� ù��° argument, 3d�� 3�ڸ����� ǥ��. 
			
		}
		else {
			System.out.println(num+"�� Ȧ���Դϴ�.");
			
		}
		input.close(); 
	}

}

