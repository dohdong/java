package cCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class BIteratorEx {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		String str;
		Iterator e = list.iterator(); //�ݺ��� ��ü ���
		while (e.hasNext())  	// ���� ���Ұ� �ִٸ� ����
		{
			str = (String)e.next();
			System.out.println(str);
		}
		
		System.out.println(list.indexOf("��"));
		System.out.println(list.lastIndexOf("��"));
		
	}

}
