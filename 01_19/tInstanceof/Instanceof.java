package tInstanceof;

public class Instanceof {

	public static void main(String[] args) {
		Object o = new Object();
		String s = new String("java");
		Integer i = new Integer("100");
		
		System.out.println(o instanceof Object);
		System.out.println(s instanceof Object);
		System.out.println(o instanceof String);
		//System.out.println(i instanceof String); // 상속관계 없음, 컴파일 오류
		System.out.println(i instanceof Object);
		
		

	}

}
