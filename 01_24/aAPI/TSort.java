package aAPI;

import java.util.Arrays;

public class TSort {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		
		Arrays.sort(scores);
		for (int i = 0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" +scores[i]);
		}
		
		//¹è¿­°Ë»ö 
		int index = Arrays.binarySearch(scores,97);
		System.out.println("Ã£Àº ÀÎµ¦½º" + index);
		System.out.println();
		
		
		String[] names = {"È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö"};
		Arrays.sort(names);
		for(int i =0; i<names.length; i++) {
			System.out.println("names[" + i + "]=" +names[i]);
			
		}
		System.out.println();
	}
}

