package aAPI;

import java.util.Random;

public class VRandom {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택 번호 :");
		
		for(int i =0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			System.out.print(selectNumber[i]+ " ");
		}
		
		
	}

}
