package b6Class;

import java.util.Scanner;

public class CMovietest {

	public static void main(String[] args) {
		CMovie m = new CMovie();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǥ������ ��ȭ ������ �Է��ϼ���:  ");
		m.pyear = scanner.nextInt();
		scanner.nextLine();          //�̰� �ʿ���...  ó���� ���ڸ� ġ�� Int�� �� ���µ�
									 // �� �� ���͸� ġ�� nextLine�� ����. �׷��� �� �� �� �ʿ���.
		m.title = scanner.nextLine(); 
		
		System.out.println(m.print());
		
		
		
	}

}
