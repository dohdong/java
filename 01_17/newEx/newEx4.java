package newEx;

import java.util.Scanner;

public class newEx4 {     //5���� ���� Ƚ������ 1~100���̿� ������ �� ���߱� ����.
	public static void main(String args[]) {
		// System.out.println((int)(Math.random()*100+1)); //�ٿ�� ���� ������ �ȵǹǷ� 0~99�� ��µ�
		// �׷��� 100 + 1 �̴�.
		
		int ranNum = ((int)(Math.random()*100+1)) ; 
		System.out.println(ranNum);

		Scanner input = new Scanner(System.in) ;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print("���ϰ� ������? : " ); 
			int num = input.nextInt();
			if (num > ranNum) {
				System.out.println("�� ���� ���� �Է��ϼ���"); 
			}
			else if (num <ranNum) {
				System.out.println("�� ū ���� �Է��ϼ���"); 
			}
			else if (num == ranNum){
				System.out.println("�����Դϴ�.");
				break;
			}
			System.out.println("��ȸ�� "+(4-i)+"�� ���ҽ��ϴ�.");
		}
		input.close();
	}
}

     