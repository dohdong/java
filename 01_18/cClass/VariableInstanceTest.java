package cClass;

public class VariableInstanceTest {   // �ν��Ͻ� ����
	
	public int num ;			// �ν��Ͻ� ����


	public static void main(String[] args) {
		VariableInstanceTest test = new VariableInstanceTest();  // ��ü ����.
		System.out.println(test.num);
		
		test.num = 50;
		System.out.println(test.num);
		
		VariableInstanceTest t2 = new VariableInstanceTest();
		System.out.println(t2.num);
		
		t2.num = 100;
		System.out.println(t2.num);
		
		test = new VariableInstanceTest();
		System.out.println(test.num);
		
		test.num =222;
		System.out.println(test.num);
		

		
		

	}

}
