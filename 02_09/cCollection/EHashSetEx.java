package cCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class EHashSetEx {

	public static void main(String[] args) {
		
		HashSet<String>set = new HashSet<String>();
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("A");
		System.out.println(set);
		
		String str;
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext())  	
		{
			str = (String)iterator.next();
			System.out.println(str);
		}
		
		for(String st : set) {
			System.out.println(st);
		}
		
	}

}
