package a5Data;

public class AStringEqualsEx {

	public static void main(String[] args) {
		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		if (strVal1 == strVal2) {   // reference �� , address�� ����.
			System.out.println("strVal1�� strVal2�� ���� ����");
		}else {
			System.out.println("strVal1�� strVal2�� ���� �ٸ�");
		}
		
		if (strVal1.equals(strVal2)) { // �����
			System.out.println("strVal1�� strVal2�� ���ڿ��� ����");
		}
		
		
		String strVal3 = new String("�Ź�ö");
		String strVal4 = new String("�Ź�ö");
		if (strVal3 == strVal4) {
			System.out.println("strVal3�� strVal4�� ���� ����");
		}else {
			System.out.println("strVal3�� strVal4�� ���� �ٸ�");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3�� strVal4�� ���ڿ��� ����");
		}
	}

}
