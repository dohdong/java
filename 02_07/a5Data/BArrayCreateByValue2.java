package a5Data;
import java.util.Scanner;


public class BArrayCreateByValue2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[3];
		int sum = 0;

		for (int i = 0; i <3 ; i++) {
			System.out.print("성적을 입력하세요 : ");
			scores[i] = scanner.nextInt();
		}
		for (int i = 0; i <3 ; i++) {
			sum += scores[i];
		}

		System.out.println("총합 : " + sum);

		double avg = (double) sum /3;
		System.out.println("평균 : " + avg);
		print();
	}
	static void print() {
		System.out.println("*****");
	}

}
