package hAbstract;

public abstract class Calc {
	
	private int a, b;
	
	
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public abstract int calculate(int a, int b);
	
	
	
	
}
