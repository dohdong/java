package cException;

//import java.io.FileInputStream;
import java.io.IOException;

// import java.

public class ExceptionTest3 {
	
	// throws 키워드에 대한 내용 
	// 다 떠넘겨 봤자 결국 에러를 토해냄. 
	
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
		// 메서드 처리중 예외가 발생됨을 모의
		if(true) throw new IOException("예외 발생"); //여기서부터 문제가생겨서 위로 올라감.
		
	}


	public static void main(String[] args)throws IOException {
		ExceptionTest3 test = new ExceptionTest3();
		test.method1();

	}

}
