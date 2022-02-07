package a5Data;

import java.util.Scanner;

public class CArrayMethod {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오 : ");
		size = scanner.nextInt();
		int[] scores = new int[size]; 

		getValue(scores);

		getAverage(scores);

		printArray(scores);
	}
	
	// 리턴을 해야하는데 scores 배열과 array 가 같은 메모리를 공유하고 있어서 필요없음.
	// scores 가 먼저 a 주소를 참조하고 있고, 그 이후 int[] array가 생겨서 같은 a 주소를 가리킨다.
	// 같은 주소를 공유한다..
	// int[] array 에 int[] scores 라고 써도 되는데, 어차피 새롭게 만들어서 같은 주소를 가리키는 것임. 
	// 객체를 넘겨줄때는 주소를 넘겨주는 것이다.
	public static void getValue(int[] array) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length ; i++) {
			System.out.print("성적을 입력하세요 : ");
			array[i] = scanner.nextInt();
		}
	}
	// 리턴을 하지 않아도 주소를 넘겨 받아서 그 주소에 있는 값을 변경시키므로 
	// main 에서 scores를 써도 값이 나온다.
	
	
	
	public static void getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i <array.length ; i++) {
			sum += array[i];
		}
		double avg = (double) sum /array.length;
		System.out.println("평균 : " + avg);
	}
	
	public static void printArray(int[] array) {
		System.out.println("배열은 아래와 같다.");
		for (int i = 0; i < array.length ; i++) {
			
			System.out.println( array[i]);


		}
	}
}
