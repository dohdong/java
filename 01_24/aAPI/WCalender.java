package aAPI;

import java.util.Calendar;

public class WCalender {
//Date�� �Ʊ� �غ�. SimpleDateFormat
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		// day, week, amPm, hour, minute, second �� �� �����ϰ� ���ϵ� �����ϸ� �ð�,��¥ ���� �� ����Ҽ��ִ�.
		
		System.out.println(year);
		System.out.println(month);
		
	}

}
