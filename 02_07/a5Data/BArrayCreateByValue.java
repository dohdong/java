package a5Data;

public class BArrayCreateByValue {

	public static void main(String[] args) {
		
		int[] scores = { 83,90, 87 };
		
		System.out.println("Scores[0] : " + scores[0]);
		System.out.println("Scores[1] : " + scores[1]);
		System.out.println("Scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i <3 ; i++) {
			sum += scores[i];
		}
		
		System.out.println("���� : " + sum);
		double avg = (double) sum /3;
		System.out.println("��� : " + avg);
		
		
	}

}
