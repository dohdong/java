package bChuClass;

public class Test {

	public static void main(String[] args) {
		//MyInterface my = new MyInterface(); �δ� ������ �ȵ�
		MyInterface my = new MyInterImpl() ; //�δ� ����������.
		System.out.println(MyInterface.MAX_VALUE);
		//MyInterface.MAX_VALUE = 10000; ���� �Ұ���. ������ final static �̹Ƿ�

	}

}
