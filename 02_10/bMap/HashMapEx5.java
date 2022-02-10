package bMap;

import java.util.*;

public class HashMapEx5 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>();

		String name;
		String tel;
		
		int d;
		String fname;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하려는 데이터 수는 :");
		d = sc.nextInt();
		
		for (int i =0; i < d; i++ ) {
			System.out.print(i+1+". 이름 , 전화번호 >> ");
			name = sc.next();
			tel = sc.next();
			map.put(name, tel);
		}
		System.out.println(" ");
		
		System.out.print("찾으려는 회원의 이름은 : ");
		fname = sc.next();
		if (map.get(fname)==null) {
			System.out.println("해당하는 회원은 리스트에 없습니다.");
		}else {
			System.out.println(fname+"님의 전화번호는 : "+map.get(fname));
		}
		
		/*
		String find = scan.next();
		if (map.containsKey(find) {                  //contains로도 가능하다.
		syso(find+"님의 전화번호 : " +map.get(find));
		}else {
		syso("없다")
		}
		 */
		
	}

}
