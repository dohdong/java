package fSeveral;

public class WCalc2 {  
	public void add(int a, int b) {
		System.out.println("add(int, int) called");
	}
	
	public double add(double x , double y) {
		System.out.println("add(double, double) called");
		return 0.0;
	}
	public void add(int a , int b, int...c) {
		
		for (int n : c)
			System.out.print(n+ " ");
		System.out.println();
	
	}
	
	public void add(int a , double b ) {
		System.out.println("add(int, double) called");
	}
	
	public void add(String a, String b) {
		System.out.println("add(String, String) called");
	}
	
	public static void main(String[] args) {
		WCalc2 c2 = new WCalc2() ;
		//c2.add(1.5, 1.5 );
		//c2.add('A', 2 );
		c2.add(1, 2,3,4,5,6,7);
		c2.add(1, 2, new int[] {10,20,30,40,50,60,70});
	}


}
