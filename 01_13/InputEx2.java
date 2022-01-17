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
		// nextLine() 도 있는데 엔터 전까지 다 받아들인다..? 잘 모름.
		// op.charAt(0), op.trim() -> 메서드 들임.
		
		// char operator = op.charAt(0);   , op.trim()    // charAt은 잘 모르겠음 ㅋㅋ
	    // if (op.charAt(0)=='+'){     //op.trim().equals("+") // 그냥 아래 방식대로 하자.
		if (operator.equals("+")) {
			System.out.printf("%1$3d + %2$3d =%3$3d\n",  num, num2, (num+num2));
		} else if (operator.equals("-")) {
			System.out.println("결과는"+num+"-"+num2+"="+(num - num2)+"입니다.");
		} else if (operator.equals("*")) {
            System.out.println("결과는"+num+"*"+num2+"="+(num*num2)+"입니다.");
		} else if (operator.equals("/")) {
            System.out.println("결과는"+num+"/"+num2+"="+(num/num2)+"입니다.");
        } else if (operator.equals("%")) {
			System.out.println("결과는"+num+"%"+num2+"="+(num%num2)+"입니다.");
		} else {
            System.out.println("잘못 입력하셨습니다. +, -, *, / 중 하나를 입력하세요.");
        }
		input.close(); 

	}
}
