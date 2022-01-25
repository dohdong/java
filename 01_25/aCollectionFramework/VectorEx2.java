package aCollectionFramework;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>(2,5);
		v.add(100.3);
		v.add(3.14);
		v.addElement(1000.0);
		
		for(Double n : v)
			System.out.println(n);
		
		//검색
		double search = 1000.0;
		int index = v.indexOf(search);
		if (index != -1)
			System.out.println("검색요소" +search+"의 위치 : "+ index);
		else
			System.out.println("검색요소" +search+"가 없습니다");
		
		
		//삭제
		System.out.println(":::::  삭제 전 용량/크기 확인  :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		double del = 3.14;
		if(v.contains(del)) {
			v.remove(del);
			System.out.println(del+"삭제 완료!");
		}
		System.out.println(":::::  삭제 후  :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		
		
		//쓰지 않는 용량을 줄일떄는
		v.trimToSize();
		System.out.println(":::::  용량 조절 후  :::::");
		System.out.println("capacity : " +v.capacity());
		System.out.println("size : "+v.size());
		
		
	}

}
