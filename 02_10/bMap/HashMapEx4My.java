package bMap;

import java.util.*;

public class HashMapEx4My {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();

		String na;
		int pop;
		String result;

		Scanner sc = new Scanner(System.in);
		System.out.println("나라이름과 인구를 3개 입력하세요");
		for (int i =0; i<3; i++) {
			System.out.print(i+1+". 나라이름, 인구 >>  ");
			na = sc.next();
			pop = sc.nextInt();
			map.put(na, pop);
			
		}
		

		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			int max = 0;
			String name = it.next();
			int n = map.get(name);
			if(max <n) {
				max = n;
				na =name ;
			}
			
		}
		//System.out.println(" 제일 인구가 많은 나라 : "+names+"의 인구수는 : "+map.get(max));
		

	}
}
