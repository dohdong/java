package cClass;

public class VariableClassTest {  //Ŭ���� ������ �޸𸮿� �����ϰ� �ϳ��� ������ �ȴ�.
	
	public static int snum;		// Ŭ��������

	public static void main(String[] args) {
		VariableClassTest test = new VariableClassTest();  // ��ü ����.

		System.out.println(test.snum);
		
		test.snum = 50;
		System.out.println(snum);
		
		VariableClassTest.snum = 100;
		System.out.println(VariableClassTest.snum);
		System.out.println(snum);
		System.out.println(" ");
		
		test = new VariableClassTest();
		System.out.println(snum);
		
		snum*=2;
		System.out.println(snum);
		System.out.println(VariableClassTest.snum);
		System.out.println(test.snum);

		
		

	}

}
