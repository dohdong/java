package forEx;


public class forEx5  {
	// A~Z까지 영문 대문자를 가로로 출력
	public static void main(String[] args) {
		for (int i = 10; i > 0 ; i= i-1) { //i-- 는 i=i-1 과 같다.
			if (i%2==1) {
				System.out.println(i);
			}

		}
	}
} 
