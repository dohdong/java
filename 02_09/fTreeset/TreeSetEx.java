package fTreeset;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> treeSet = new TreeSet<String>();
		String name;
		
		for(int i=0; i<5 ; i++) {
			System.out.print("�߰��� ȸ���� �̸��� :");
			name = sc.next();
			treeSet.add(new String(name));
			
		}
		
		System.out.println(treeSet);
		
	}

}
