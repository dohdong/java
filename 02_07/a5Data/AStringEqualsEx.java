package a5Data;

public class AStringEqualsEx {

	public static void main(String[] args) {
		String strVal1 = "신민철";
		String strVal2 = "신민철";
		if (strVal1 == strVal2) {   // reference 비교 , address가 같음.
			System.out.println("strVal1과 strVal2는 참조 같음");
		}else {
			System.out.println("strVal1과 strVal2는 참조 다름");
		}
		
		if (strVal1.equals(strVal2)) { // 내용비교
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		
		String strVal3 = new String("신민철");
		String strVal4 = new String("신민철");
		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 참조 같음");
		}else {
			System.out.println("strVal3과 strVal4는 참조 다름");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		}
	}

}
