package cClass;

public class VariableTest {
	
	public int num ;			// �ν��Ͻ� ����
	public final int PORT=5000;	// ���
	public static int snum;		// Ŭ��������

	public static void main(String[] args) {
		VariableTest test = new VariableTest();  // ��ü ����.
		
		System.out.println(test.num);
		System.out.println(test.PORT);
		System.out.println(test.snum);
		// test.PORT=3000;	// final �� �����ϱ� ���⼭ �ʱ�ȭ�� �ȵ�
		
		
		

	}

}
