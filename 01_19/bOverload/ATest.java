package bOverload;

public class ATest {
	public ATest() {
		System.out.println("Test() called");
	}
	public ATest(int a) {
		System.out.println("Test(int) called");
	}
	public ATest(int a , int b) {
		
		this(a);
		System.out.println("Test(int,int) called");
		
		
	}
	
	

	public static void main(String[] args) {
		ATest t3 = new ATest(1,100);
		

	}

}
