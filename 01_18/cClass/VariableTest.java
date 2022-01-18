package cClass;

public class VariableTest {
	
	public int num ;			// 인스턴스 변수
	public final int PORT=5000;	// 상수
	public static int snum;		// 클래스변수

	public static void main(String[] args) {
		VariableTest test = new VariableTest();  // 객체 생성.
		
		System.out.println(test.num);
		System.out.println(test.PORT);
		System.out.println(test.snum);
		// test.PORT=3000;	// final 로 했으니까 여기서 초기화는 안됨
		
		
		

	}

}
