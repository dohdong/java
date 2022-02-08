package hAbstract;

public class Div extends Calc{
	
	public Div(int a, int b) {
		setValue(a,b);
	}
	
	@Override
	public int calculate(int a, int b) {
		
		return a/b;
	}
	
}