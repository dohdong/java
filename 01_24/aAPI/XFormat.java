package aAPI;

import java.text.DecimalFormat;

public class XFormat {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		
		
		
	}

}
