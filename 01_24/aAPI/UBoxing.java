package aAPI;

public class UBoxing { //������ �ڵ� �ڽ̰� ��ڽ��� ���� �ʾҴµ�, 1.5�������� �ȴٴ���...

	public static void main(String[] args) {
		//�ڵ� Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		//���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		//���� �� �ڵ� Unboxing
		int result = obj +100;
		System.out.println("result : " + result);
		
		
		//����� ���̹Ƿ� ���� �ٸ���.
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 ==obj2);
		//������ ���� ���Ϸ��� ��ڽ����־���Ѵ�.
		System.out.println("��ڽ� �� ��� : " +(obj1.intValue() == obj2.intValue()));
		
		// �ٸ� -128~127 ���� �̳��ϰ�� ����� ���¿����� ����.
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		
		
	}

}
