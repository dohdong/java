import java.util.Scanner;

public class forEx3  {
	//Ex3> ������ �Է¹ް� , ������  ������� ���� ����Ͻÿ�

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print(" ���� �Է� : " ); // �ԷµȰ��� �������̹Ƿ�
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