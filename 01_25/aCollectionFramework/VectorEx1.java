package aCollectionFramework;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);  //ó�� �뷮�� 2����, 5������ �뷮�� ���������شٴ� �ǹ�.
		System.out.println("::::: Vector������ :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		
		v.add("k3");
		v.add("k5");
		v.add("k7");
		
		System.out.println(":::::  ��� �߰���  :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		
		
	}

}
