package aCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class YMapEx1 {

	public static void main(String[] args) { // 둘다 중복안됨.
		String[] cars = {  "k7",  "K3", "k5","G80", "G70","k9","G90"};
		Integer[] prices = {4000, 3000, 9000, 6000, 5000, 8000, 2000};
		HashMap<String,Integer> map = new HashMap();
		
		for(int i = 0; i<cars.length; i++) {
			map.put(cars[i], prices[i]);
		}
		
		System.out.println("map의 크기 : " +map.size());
		//key는 중복을 허용하지 않고, null을 허용하지 않으므로, key집합만 꺼내오면 순서 보장 안됨.
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
			
		}
		
		System.out.println("map의 크기 : "+map.size());
		
	}

}
