package a5Data;

import java.util.Scanner;

public class DFor {

	public static void main(String[] args) {
		//�迭�� ũ�� ���ϱ�
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		size = scanner.nextInt();
		String[] arr = new String[size]; 
		
		//�迭�� ������ ���ڿ� �Է¹ޱ�
		System.out.println("�迭�� ������ ���ڿ��� �Է��ϼ��� : ");
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = scanner.next();
		}
		
		//for each ��
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
