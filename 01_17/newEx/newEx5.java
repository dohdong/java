//package newEx;
//
//import java.util.Scanner;
//
//public class newEx5 {     
//	public static void main(String args[]) {
//		
//		Scanner input = new Scanner(System.in) ;
//		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : " ); 
//		String num = input.next();	
//		int[] checkNum = {2,3,4,5,6,7,8,9,2,3,4,5};
//		
//		int sum = 0;
//		
//		for (int i = 0; i < checkNum.length; i++) {
//			
//			int gajung = (num.charAt(i)-48)* checkNum[i];
//			sum = sum + gajung;
//			System.out.println((num.charAt(i)-48)* checkNum[i]);
//		}
//		System.out.println(sum);
//		
//		int checkDigit = 11- (sum%11) ; 
//		System.out.println(checkDigit);
//		if (checkDigit >= 10) {
//			checkDigit = checkDigit-10;
//		}
//		if (checkDigit == (num.charAt(12)-48)) {
//			System.out.println("��ȿ�� �ֹι�ȣ");
//		}
//		else {
//			System.out.println("Ʋ���ֹι�ȣ");
//		}
//		
//		
//		
//		
//	}
//}

// ascii �ڵ� ���� �Ⱦ �ٸ��ɷ� �غ�.
package newEx;

import java.util.Scanner;


public class newEx5 {     
	public static void main(String args[]) {


		Scanner input = new Scanner(System.in) ;
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : " ); 
		String num = input.next();	
		int[] checkNum = {2,3,4,5,6,7,8,9,2,3,4,5};

		int sum = 0;

		for (int i = 0; i < checkNum.length; i++) {

			int gajung = (Character.getNumericValue(num.charAt(i)))* checkNum[i];
			sum = sum + gajung;
			System.out.println((Character.getNumericValue(num.charAt(i)))* checkNum[i]);
		}
		System.out.println(sum);

		int checkDigit = 11- (sum%11) ; 
		System.out.println(checkDigit);
		if (checkDigit >= 10) {
			checkDigit = checkDigit-10;
		}
		if (checkDigit == (Character.getNumericValue(num.charAt(12)))) {
			System.out.println("��ȿ�� �ֹι�ȣ");
		}
		else {
			System.out.println("Ʋ���ֹι�ȣ");
		}

	}
}

