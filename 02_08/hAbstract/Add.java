package hAbstract;

public class Add extends Calc{
	
	public Add(int a, int b) {
		setValue(a,b);
		
		
	}
	
	@Override
	public int calculate(int a, int b) {
		
		return a+b;
	}
	
}
