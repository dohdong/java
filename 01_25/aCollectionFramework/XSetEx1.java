package aCollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class XSetEx1 {

	public static void main(String[] args) { // 둘다 중복안됨.
		String[] groupA = {  "k7",  "K3", "k5","G80","G70", "G70","k9","G90"};
		HashSet<String> hs = new HashSet<String>(); // 정렬x , Iterator로 요소를 꺼냄
		TreeSet<String> ts = new TreeSet<String>(); // 정렬  , Iterator로 요소를 꺼냄
		
		for (String n : groupA) {
			hs.add(n);  
			ts.add(n);
		}
		System.out.println("hs의 크기 :"+hs.size() );
		System.out.println("ts의 크기 :"+ts.size() );
		System.out.println("hs :"+hs );
		System.out.println("ts :"+ts );
		
		// Iterator는 자바의 컬렉션프레임워크에서 컬렉션에 저장되어있는 요소들을 읽어오는 방법을 표준화한 객체중 하나이다.
		// hasNext(), next(), remove()
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			iter.remove();
			
		}
		System.out.println("hs의 크기 :"+hs.size() );
		
		
	}

}
