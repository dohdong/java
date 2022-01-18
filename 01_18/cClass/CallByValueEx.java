package cClass;

public class CallByValueEx {  
	
	public void change(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	
	
	public static void main(String[] args) {
		int x = 3, y = 7;
		CallByValueEx ex = new CallByValueEx();
		System.out.println("x="+x+", y="+y);
		ex.change(x, y);
		System.out.println("x="+x+", y="+y);
	}

}
