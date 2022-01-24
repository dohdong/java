package aAPI;

import java.text.SimpleDateFormat;

public class OTime {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 1 ; i<=10000; i++) {
			sum+=i;
		}
		 
		long time2 = System.nanoTime();
		
		long time3 = System.currentTimeMillis();
		
		
		System.out.println("1~10000합 " + sum);
		System.out.println(time2-time1+ "초 소요");

		
		System.out.println(time3);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(time3));
	}

}
