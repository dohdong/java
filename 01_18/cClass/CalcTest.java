package cClass;


public class CalcTest {
	public static void main(String[] args) {
		Calc  c1 = new Calc(); //Calc클래스의 객체를 생성		    
		   int r = c1.calculate(30, 5, "/");
		   System.out.println(r);
		   c1.squarePower(3, 5);

	}
	
}

