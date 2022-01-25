package aCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class YMapEx1 {

	public static void main(String[] args) { // �Ѵ� �ߺ��ȵ�.
		String[] cars = {  "k7",  "K3", "k5","G80", "G70","k9","G90"};
		Integer[] prices = {4000, 3000, 9000, 6000, 5000, 8000, 2000};
		HashMap<String,Integer> map = new HashMap();
		
		for(int i = 0; i<cars.length; i++) {
			map.put(cars[i], prices[i]);
		}
		
		System.out.println("map�� ũ�� : " +map.size());
		//key�� �ߺ��� ������� �ʰ�, null�� ������� �����Ƿ�, key���ո� �������� ���� ���� �ȵ�.
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
			
		}
		
		System.out.println("map�� ũ�� : "+map.size());
		
	}

}
