package bMap;

import java.util.*;

public class HashMapEx3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("java","�ڹ�");
		map.put("school","�б�");
		map.put("map","����");
		
		//key���� �������°�.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("***keySet()***");
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println("�ܾ� : "+key + " , �ǹ� : " +value);
		}
		System.out.println();
		
		//��ü�� �������°�
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,String>>entryIterator = entrySet.iterator();
		System.out.println("***entrySet()***");
		while(entryIterator.hasNext()) {
			Map.Entry<String,String>entry =entryIterator.next();
			String key = entry.getKey();	
			String value = entry.getValue();
			System.out.println("�ܾ� : "+key + " , �ǹ� : " +value);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("ã�� ���� �ܾ� : ");
			String key = sc.next();
			
			if (map.get(key)==null) {
				System.out.println("ã�´ܾ �����ϴ�.");
			}else {
				System.out.println("�ܾ��� �ǹ̴� " +map.get(key));
			}
			
			if(key.equals("quit")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}while(true);
	
		
		
	}

}
