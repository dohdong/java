package aAPI;

import java.util.Calendar;

public class WCalender {
//Date는 아까 해봄. SimpleDateFormat
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		// day, week, amPm, hour, minute, second 를 다 설정하고 요일도 설정하면 시간,날짜 등을 다 출력할수있다.
		
		System.out.println(year);
		System.out.println(month);
		
	}

}
