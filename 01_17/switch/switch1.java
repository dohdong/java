import java.util.Scanner;



public class switch1  {
	//����ڷκ��� 1~100������ ������ �Է¹޽��ϴ�.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("1~100������ ���� �Է� : " ); 
		int num = input.nextInt();
		
		switch(num%2) {
		case 0  : 
			System.out.printf("%d�� ¦���Դϴ�.\n", num); 
			break;
		case 1 :
			System.out.println(num+"�� Ȧ���Դϴ�.");
			break;
		

		}
		input.close();
	}
}

