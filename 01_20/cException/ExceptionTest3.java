package cException;

//import java.io.FileInputStream;
import java.io.IOException;

// import java.

public class ExceptionTest3 {
	
	// throws Ű���忡 ���� ���� 
	// �� ���Ѱ� ���� �ᱹ ������ ���س�. 
	
	public void method1() throws IOException {
		System.out.println("method1() called");
		method2();
	}
	
	public void method2() throws IOException {
		System.out.println("method2() called");
		method3();
	}
	
	public void method3() throws IOException {
		System.out.println("method3() called");
		// �޼��� ó���� ���ܰ� �߻����� ����
		if(true) throw new IOException("���� �߻�"); //���⼭���� ���������ܼ� ���� �ö�.
		
	}


	public static void main(String[] args)throws IOException {
		ExceptionTest3 test = new ExceptionTest3();
		test.method1();

	}

}
