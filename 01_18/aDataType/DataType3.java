package aDataType;


public class DataType3{
	boolean b ;
	int num;
	char ch;
	double d;
	String s; 
	
	public void method() { // ��� �޼���.
		System.out.println(num);
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		// ����� �ƴѰ�� �ݵ�� ��ü �����ؼ� ����ؾ� �մϴ�.
		DataType3 t2 = new DataType3(); //��ü ����

		System.out.println(t2.num);     // 0
		System.out.println(t2.b);		// false
		System.out.println(t2.ch);		// ����
		System.out.println(t2.d);		// 0.0
		System.out.println(t2.s);		// null   default �ʱⰪ.���� �ʱ�ȭ�� �Ǿ�����.


	}

}
