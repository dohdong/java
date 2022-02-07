package a5Data;

import java.util.Scanner;

public class CArrayMethod {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		size = scanner.nextInt();
		int[] scores = new int[size]; 

		getValue(scores);

		getAverage(scores);

		printArray(scores);
	}
	
	// ������ �ؾ��ϴµ� scores �迭�� array �� ���� �޸𸮸� �����ϰ� �־ �ʿ����.
	// scores �� ���� a �ּҸ� �����ϰ� �ְ�, �� ���� int[] array�� ���ܼ� ���� a �ּҸ� ����Ų��.
	// ���� �ּҸ� �����Ѵ�..
	// int[] array �� int[] scores ��� �ᵵ �Ǵµ�, ������ ���Ӱ� ���� ���� �ּҸ� ����Ű�� ����. 
	// ��ü�� �Ѱ��ٶ��� �ּҸ� �Ѱ��ִ� ���̴�.
	public static void getValue(int[] array) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length ; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			array[i] = scanner.nextInt();
		}
	}
	// ������ ���� �ʾƵ� �ּҸ� �Ѱ� �޾Ƽ� �� �ּҿ� �ִ� ���� �����Ű�Ƿ� 
	// main ���� scores�� �ᵵ ���� ���´�.
	
	
	
	public static void getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i <array.length ; i++) {
			sum += array[i];
		}
		double avg = (double) sum /array.length;
		System.out.println("��� : " + avg);
	}
	
	public static void printArray(int[] array) {
		System.out.println("�迭�� �Ʒ��� ����.");
		for (int i = 0; i < array.length ; i++) {
			
			System.out.println( array[i]);


		}
	}
}
