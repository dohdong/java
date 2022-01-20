package cException;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("start");
		int num = -1;
		
		try {
			num = Integer.parseInt(args[0]);
			System.out.println("다른 실행 코드");
	
		}catch(NumberFormatException e) {
			System.out.println("NFE 예외처리");
			
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("AIOBE 예외처리");
			
		}finally {
			System.out.println("resource 정리");
			
		}
		
		//로직
		if (num%2 ==0 ) {   // && num != -1 을 이용해서 예외상태일때 로직이 실행되지 않게 할 수 있음.
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("end");

	}

}
