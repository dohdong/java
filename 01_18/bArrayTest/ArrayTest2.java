package bArrayTest;



public class ArrayTest2{

	public static void main(String[] args) {
		String[] strings;   //����
		String[] strings2;
		String[] strings3;
		
		strings = new String[5];  //����, default �ʱⰪ���� �ʱ�ȭ ��.
		strings2 = new String[] {new String("java"), new String("python"),new String("db, sql")}; //����, ����� �ʱ�ȭ, 1���� �迭
		strings3 = new String[] {"Django", "jsp/servlet"};
		
		System.out.println(strings.length);
		System.out.println(strings2.length);
		

		
		// ��� �Ϸ��� �Ʒ�ó�� �ؾ��ϳ���.
		for(int idx = 0; idx<strings.length; idx++) {
			System.out.print(strings[idx]+" ");
		}System.out.println();
		
		for (String n : strings2) { // ������ ���ٸ� ����, advanced for��
			System.out.print(n+" ");
		}System.out.println();
		
		System.out.println(strings3[1]);

	}

}
