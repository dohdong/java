package bMap;

import java.util.*;

public class HashMapEx3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("java","자바");
		map.put("school","학교");
		map.put("map","지도");
		
		//key값을 가져오는것.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("***keySet()***");
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println("단어 : "+key + " , 의미 : " +value);
		}
		System.out.println();
		
		//전체를 가져오는것
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,String>>entryIterator = entrySet.iterator();
		System.out.println("***entrySet()***");
		while(entryIterator.hasNext()) {
			Map.Entry<String,String>entry =entryIterator.next();
			String key = entry.getKey();	
			String value = entry.getValue();
			System.out.println("단어 : "+key + " , 의미 : " +value);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("찾고 싶은 단어 : ");
			String key = sc.next();
			
			if (map.get(key)==null) {
				System.out.println("찾는단어가 없습니다.");
			}else {
				System.out.println("단어의 의미는 " +map.get(key));
			}
			
			if(key.equals("quit")) {
				System.out.println("종료되었습니다.");
				break;
			}
		}while(true);
	
		
		
	}

}
