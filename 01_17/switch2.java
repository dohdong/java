import java.util.Scanner;


public class switch2 {
	//����ڷκ��� �ΰ��� ������ �ϳ��� ������(*, /, +, -) �ϳ��� �Է¹޽��ϴ�.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("����1 �Է� : " );	
		int num = input.nextInt();
		System.out.print("����2 �Է� : " );	
		int num2 = input.nextInt();
		System.out.print("������ �Է�(+,-,*,/,%) : " );	
		String operator = input.next();
		
		switch(operator.trim()) {
		case "+" : 
			System.out.printf("%1$3d + %2$3d =%3$3d\n",  num, num2, (num+num2));
			break;
		case "-" :
			System.out.println("�����"+num+"-"+num2+"="+(num - num2)+"�Դϴ�.");
			break;
		case "*" : 
			System.out.println("�����"+num+"*"+num2+"="+(num*num2)+"�Դϴ�."); break;
		case "/" : System.out.println("�����"+num+"/"+num2+"="+(num/num2)+"�Դϴ�."); break;
		
		}
		input.close(); 

	
	}
}

