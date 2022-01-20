package bChuClass;

public class Test {

	public static void main(String[] args) {
		//MyInterface my = new MyInterface(); 로는 생성이 안됨
		MyInterface my = new MyInterImpl() ; //로는 생성가능함.
		System.out.println(MyInterface.MAX_VALUE);
		//MyInterface.MAX_VALUE = 10000; 변경 불가함. 이유는 final static 이므로

	}

}
