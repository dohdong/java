package dArray;

import java.util.ArrayList;

public class CArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("ȫ��");
		
		list.add("�̰�����");
		list.add("��");
		list.add("������");
		
		System.out.println("������ ��õ �ý����Դϴ�.");
		
		int index = (int)(Math.random()*list.size());
		System.out.println("��õ�������� "+list.get(index));
		
	}

}
