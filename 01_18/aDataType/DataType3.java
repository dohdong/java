package aDataType;


public class DataType3{
	boolean b ;
	int num;
	char ch;
	double d;
	String s; 
	
	public void method() { // 멤버 메서드.
		System.out.println(num);
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		// 멤버가 아닌경우 반드시 객체 생성해서 사용해야 합니다.
		DataType3 t2 = new DataType3(); //객체 생성

		System.out.println(t2.num);     // 0
		System.out.println(t2.b);		// false
		System.out.println(t2.ch);		// 공백
		System.out.println(t2.d);		// 0.0
		System.out.println(t2.s);		// null   default 초기값.으로 초기화가 되어있음.


	}

}
