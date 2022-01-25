package aCollectionFramework;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);  //처음 용량은 2였고, 5단위로 용량을 증가시켜준다는 의미.
		System.out.println("::::: Vector생성시 :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		
		v.add("k3");
		v.add("k5");
		v.add("k7");
		
		System.out.println(":::::  요소 추가후  :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		
		
	}

}
