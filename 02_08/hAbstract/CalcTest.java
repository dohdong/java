package hAbstract;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요. ");
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();

		System.out.println("연산자를 입력하세요 (+,-,*,/ ) ");
		String op = sc.next();
		char c= op.charAt(0);


		switch(c) {
		case '+' :
			Add add = new Add(Num1, Num2);
			System.out.println(Num1+" + "+Num2+" = "+add.calculate(Num1, Num2));
			break;

		case '-' :

			Sub sub = new Sub(Num1, Num2);
			System.out.println(Num1+" - "+Num2+" = "+sub.calculate(Num1, Num2));
			break;

		case '*' :	

			Mul mul = new Mul(Num1, Num2);
			System.out.println(Num1+" * "+Num2+" = "+mul.calculate(Num1, Num2));
			break;

		case '/' :
			Div div = new Div(Num1, Num2);
			System.out.println(Num1+" / "+Num2+" = "+div.calculate(Num1, Num2));
			break;


		}

	}
}