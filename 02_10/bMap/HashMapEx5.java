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
		System.out.print("�Է��Ϸ��� ������ ���� :");
		d = sc.nextInt();
		
		for (int i =0; i < d; i++ ) {
			System.out.print(i+1+". �̸� , ��ȭ��ȣ >> ");
			name = sc.next();
			tel = sc.next();
			map.put(name, tel);
		}
		System.out.println(" ");
		
		System.out.print("ã������ ȸ���� �̸��� : ");
		fname = sc.next();
		if (map.get(fname)==null) {
			System.out.println("�ش��ϴ� ȸ���� ����Ʈ�� �����ϴ�.");
		}else {
			System.out.println(fname+"���� ��ȭ��ȣ�� : "+map.get(fname));
		}
		
		/*
		String find = scan.next();
		if (map.containsKey(find) {                  //contains�ε� �����ϴ�.
		syso(find+"���� ��ȭ��ȣ : " +map.get(find));
		}else {
		syso("����")
		}
		 */
		
	}

}
