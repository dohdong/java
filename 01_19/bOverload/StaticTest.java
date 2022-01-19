package bOverload;

public class StaticTest {

	public int num;
	public static int snum;

	public void method() {
		System.out.println(num);
		System.out.println(snum);
	}

	public void method2() {
		method();
		staticMethod();
	}

	public static void staticMethod() {
		//System.out.println(num);
		System.out.println(snum);
	}

	public static void staticMethod2() {
		//method();
		staticMethod();   //같은 스태틱만 호출이 가능하다. 아니면 에러가 나온다.
	}	


}


