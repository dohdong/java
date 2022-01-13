import java.util.Scanner;




public class InputEx2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("정수1 입력 : " );	
		int num = input.nextInt();
		System.out.print("정수2 입력 : " );	
		int num2 = input.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : " );	
		String operator = input.next();
		
		if (operator.equals("+")) {
			System.out.print("결과는"+num+"+"+num2+"="+(num + num2)+"입니다.");
		} else if (operator.equals("-")) {
			System.out.print("결과는"+num+"-"+num2+"="+(num - num2)+"입니다.");
		} else if (operator.equals("*")) {
            System.out.println("결과는"+num+"*"+num2+"="+(num*num2)+"입니다.");
		} else if (operator.equals("/")) {
            System.out.println("결과는"+num+"/"+num2+"="+(num/num2)+"입니다.");
        } else if (operator.equals("%")) {
			System.out.print("결과는"+num+"%"+num2+"="+(num%num2)+"입니다.");
		} else {
            System.out.println("잘못 입력하셨습니다. +, -, *, / 중 하나를 입력하세요.");
        }
		input.close(); 

	}
}
