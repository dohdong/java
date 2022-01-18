package cClass;

public class VariableClassTest {  //클래스 변수는 메모리에 유일하게 하나만 생성이 된다.
	
	public static int snum;		// 클래스변수

	public static void main(String[] args) {
		VariableClassTest test = new VariableClassTest();  // 객체 생성.

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
