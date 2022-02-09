package cCollection;

import java.util.LinkedList;
import java.util.List;

public class DLinkedListEx {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i =0 ; i<10000 ; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		
		endTime = System.nanoTime();
		System.out.println("List :   " + (endTime-startTime)+"ns");
		startTime = System.nanoTime();
		for(int i =0 ; i<10000 ; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("linked : " + (endTime-startTime) + "ns");
	}

}
