package cException;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("start");
		int num = -1;
		
		try {
			num = Integer.parseInt(args[0]);
			System.out.println("�ٸ� ���� �ڵ�");
	
		}catch(NumberFormatException e) {
			System.out.println("NFE ����ó��");
			
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("AIOBE ����ó��");
			
		}finally {
			System.out.println("resource ����");
			
		}
		
		//����
		if (num%2 ==0 ) {   // && num != -1 �� �̿��ؼ� ���ܻ����϶� ������ ������� �ʰ� �� �� ����.
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		System.out.println("end");

	}

}
