package cCollection;

import java.util.HashSet;
import java.util.Scanner;

public class EHashSetEx2 {

	public static void main(String[] args) {
		HashSet<String>set = new HashSet<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i= 0; i<5; i++) {
			System.out.print("�߰��� ȸ���� �̸��� : ");
			set.add(scanner.next());
		}
		System.out.println(set);
	}

}
