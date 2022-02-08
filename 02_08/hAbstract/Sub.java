package hAbstract;

public class Sub extends Calc{
	
	public Sub(int a, int b) {
		setValue(a,b);
	}
	
	@Override
	public int calculate(int a, int b) {
		
		return a-b;
	}
	
}