package bMap;

import java.util.*;

public class HashMapEx4 {


	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();

		String na;
		int pop;
		String result;

		Scanner sc = new Scanner(System.in);
		System.out.println("�����̸��� �α��� 3�� �Է��ϼ���");
		for (int i =0; i<3; i++) {
			System.out.print(i+1+". �����̸�, �α� >>  ");
			na = sc.next();
			pop = sc.nextInt();
			map.put(na, pop);
		}

		result = findMax(map);
		System.out.println(" ���� �α��� ���� ���� : "+result +", " +map.get(result));
	}

	public static String findMax(HashMap<String, Integer> m) {
		int max = 0;
		String na = " ";
		Set<String> names = m.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int n = m.get(name);
			if(max <n) {
				max = n;
				na =name ;
			}
		}
		return na;
	}
}


		
		
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		System.out.println("***keySet()***");
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			System.out.println("���� : "+key + " , �α� : " +value);
//			
//			
//		}
//		System.out.println();
//		
//		System.out.println(" ");
//		
		

		
		
		
		
//		Set<Map.Entry<String, Integer>> naent = pop.entrySet();
//		Iterator<Map.Entry<String, Integer>>nait = naent.iterator();
//		while(keyIterator.hasNext()) {
//			Map.entry<String, Integer> entry = nait.next();
//			if(entry.getValue() >= maxpop) {
//				maxpop = entry.getValue();
//				maxna = entry.getKey();
//			}
//			
//		}

		
//		Integer maxValue = Collections.max(map.values());
//		
//		System.out.println(maxValue);
		
		
//		Set<String> keySet2 = map.keySet();
//		Iterator<String> k = keySet2.iterator();
//		int max = 0;
//		while(keyIterator.hasNext()) {
//			String key = k.next();
//			int a = map.get(key);
//			if(a>max) {
//				max = a;
//				na = key;
//			}
//			System.out.println("���� : "+key + " , �α� : ");
//		}
		
		
			
			
