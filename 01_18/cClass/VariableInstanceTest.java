package cClass;

public class VariableInstanceTest {   // 인스턴스 변수
	
	public int num ;			// 인스턴스 변수


	public static void main(String[] args) {
		VariableInstanceTest test = new VariableInstanceTest();  // 객체 생성.
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
