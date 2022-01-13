
public class OperatorEx2 {
	
	public static void main(String[] args) {
		//산술연산자. 정수로 실행하면 결과가 정수로 나온다.
		int x = 3 , y = 7;
		int result = x+y;
		System.out.println(result);
		
		// 비교 연산자의 결과는 boolean
		int x1 = 3 , y1 = 7;
		boolean result1 = x1>=y1;
		System.out.println(result1);
		result1 = x1 != y1;
		System.out.println(result1);
		
		// 비트 연산자.
		int result2 = x & y;          // 00000011 이랑 00000111 비교해서 &, |, ^ 
		System.out.println(result2);  //  & 는 and 니까 겹치는 11 만 해서 3
		result2 = x | y;              //  | 는 or 니까 111해서 7
		System.out.println(result2);  //  ^ 는 익스클루시브 or 이라 안겹치면 1 겹치면 0 이라 
		result2 = x ^ y;              //  00000100 이라 4.
		System.out.println(result2);	
		
		// 논리 연산자. 결과는 boolean
		// && 는 모두 참일때만 참. || 는 하나라도 참이면 참. ! 는 참은 거짓으로 거짓은 참으로.
		boolean result3 = x>=y && x<y ;
		System.out.println(result3); // false 랑 true 둘다 있으니 false가 나옴.
		
		// shift 연산자. 
		// left shift 는 왼쪽으로 bit를 이동시키고 오른쪽 bit는 0으로 채움, X<<Y = X*2^y과 동일
		// ex) 00000101 를 10100000 = 128+32 = 160 = 5 * 2^5 = 5 * 32 가 된다.
		// right shift는 오른쪽으로 bit를 이동시키고 왼쪽 bit는 sign bit로 채움, X>>Y = X/2^y과 동일
		int result4 = x<<y ;
		System.out.println(result4);	
		x = 160; y = 3;
		result4 = x<<y ;              // 10100000000 = 1024 + 256 = 1280 뭐임 맞는거 아님?
		System.out.println(result4);  // 이거 왜 1280 으로 되는지 확인 앞에서는 20으로 나옴.
		                              // << 이거는 1280맞음. 근데 앞에서는 >> 이걸로했네. 아항
		result4 = x>>>y;               
		System.out.println(result4);
		x = -160;
		result2 = x>>y;
		System.out.println(result4);
		
	}

}
