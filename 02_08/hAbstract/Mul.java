package hAbstract;

public class Mul extends Calc{
	
	public Mul(int a, int b) {
		setValue(a,b);
	}
	
	@Override
	public int calculate(int a, int b) {
		
		return a*b;
	}
	
}