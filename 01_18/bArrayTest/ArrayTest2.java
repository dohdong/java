package bArrayTest;



public class ArrayTest2{

	public static void main(String[] args) {
		String[] strings;   //선언
		String[] strings2;
		String[] strings3;
		
		strings = new String[5];  //생성, default 초기값으로 초기화 됨.
		strings2 = new String[] {new String("java"), new String("python"),new String("db, sql")}; //생성, 명시적 초기화, 1차원 배열
		strings3 = new String[] {"Django", "jsp/servlet"};
		
		System.out.println(strings.length);
		System.out.println(strings2.length);
		

		
		// 출력 하려면 아래처럼 해야하나봄.
		for(int idx = 0; idx<strings.length; idx++) {
			System.out.print(strings[idx]+" ");
		}System.out.println();
		
		for (String n : strings2) { // 순차적 접근만 가능, advanced for문
			System.out.print(n+" ");
		}System.out.println();
		
		System.out.println(strings3[1]);

	}

}
