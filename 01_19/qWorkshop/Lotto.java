package qWorkshop;

import java.util.Random;

public class Lotto {

	public static final int LOTTO_NUM_CNT = 6; //변수명이 대문자면 final 밑줄쳐져있으면 static


	public int[] generateLottoNumbers(){
		int[] nums = new int[LOTTO_NUM_CNT];
		
		int rn = 0;
		nums[0] = getRandomNumber();

		for(int i=0; i<LOTTO_NUM_CNT; i++) {
			rn = getRandomNumber();
			

			for(int j=0; j<LOTTO_NUM_CNT; j++) {
				if(rn == nums[j]) {
					j=0;
					rn = getRandomNumber();
					
				}else {
					continue;
				}
			}nums[i] = rn;
		}
		return nums;


	}

	public void displayLottoNumbers(int[] lottoNumbers){
		System.out.println("<<Lotto>>");
		for(int i : lottoNumbers) {
			System.out.print(i+" ");
		}


	}

	public void sortLottoNumbers(int[] lottoNumbers) {
		for(int i=0; i<LOTTO_NUM_CNT; i++) {
			for(int j=i+1; j<LOTTO_NUM_CNT; j++) {
				if (lottoNumbers[i]>lottoNumbers[j]) {
					int num = lottoNumbers[i];
					lottoNumbers[i] = lottoNumbers[j];
					lottoNumbers[j] = num;
				}
			}
		}
	}


	private static int getRandomNumber() {

		Random r = new Random();
		int randomNumber = r.nextInt(45) +1;
		return randomNumber;


	}


}