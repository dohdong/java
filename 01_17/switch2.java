import java.util.Scanner;


public class switch2 {
	//사용자로부터 두개의 정수와 하나의 연산자(*, /, +, -) 하나를 입력받습니다.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("정수1 입력 : " );	
		int num = input.nextInt();
		System.out.print("정수2 입력 : " );	
		int num2 = input.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : " );	
		String operator = input.next();
		
		switch(operator.trim()) {
		case "+" : 
			System.out.printf("%1$3d + %2$3d =%3$3d\n",  num, num2, (num+num2));
			break;
		case "-" :
			System.out.println("결과는"+num+"-"+num2+"="+(num - num2)+"입니다.");
			break;
		case "*" : 
			System.out.println("결과는"+num+"*"+num2+"="+(num*num2)+"입니다."); break;
		case "/" : System.out.println("결과는"+num+"/"+num2+"="+(num/num2)+"입니다."); break;
		
		}
		input.close(); 

	
	}
}

