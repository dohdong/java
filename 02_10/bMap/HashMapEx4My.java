package bMap;

import java.util.*;

public class HashMapEx4My {

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
		//System.out.println(" ���� �α��� ���� ���� : "+names+"�� �α����� : "+map.get(max));
		

	}
}
