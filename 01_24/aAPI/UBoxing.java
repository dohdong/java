package aAPI;

public class UBoxing { //원래는 자동 박싱과 언박싱이 되지 않았는데, 1.5버전부터 된다던가...

	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		//대입 시 자동 Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		//연산 시 자동 Unboxing
		int result = obj +100;
		System.out.println("result : " + result);
		
		
		//포장된 값이므로 서로 다르다.
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 ==obj2);
		//내부의 값만 비교하려면 언박싱해주어야한다.
		System.out.println("언박싱 후 결과 : " +(obj1.intValue() == obj2.intValue()));
		
		// 다만 -128~127 범위 이내일경우 포장된 상태에서도 같다.
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		
		
	}

}
