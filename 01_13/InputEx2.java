import java.util.Scanner;




public class InputEx2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("����1 �Է� : " );	
		int num = input.nextInt();
		System.out.print("����2 �Է� : " );	
		int num2 = input.nextInt();
		System.out.print("������ �Է�(+,-,*,/,%) : " );	
		String operator = input.next();
		// nextLine() �� �ִµ� ���� ������ �� �޾Ƶ��δ�..? �� ��.
		// op.charAt(0), op.trim() -> �޼��� ����.
		
		// char operator = op.charAt(0);   , op.trim()    // charAt�� �� �𸣰��� ����
	    // if (op.charAt(0)=='+'){     //op.trim().equals("+") // �׳� �Ʒ� ��Ĵ�� ����.
		if (operator.equals("+")) {
			System.out.printf("%1$3d + %2$3d =%3$3d\n",  num, num2, (num+num2));
		} else if (operator.equals("-")) {
			System.out.println("�����"+num+"-"+num2+"="+(num - num2)+"�Դϴ�.");
		} else if (operator.equals("*")) {
            System.out.println("�����"+num+"*"+num2+"="+(num*num2)+"�Դϴ�.");
		} else if (operator.equals("/")) {
            System.out.println("�����"+num+"/"+num2+"="+(num/num2)+"�Դϴ�.");
        } else if (operator.equals("%")) {
			System.out.println("�����"+num+"%"+num2+"="+(num%num2)+"�Դϴ�.");
		} else {
            System.out.println("�߸� �Է��ϼ̽��ϴ�. +, -, *, / �� �ϳ��� �Է��ϼ���.");
        }
		input.close(); 

	}
}
