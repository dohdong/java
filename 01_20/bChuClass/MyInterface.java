package bChuClass;

public interface MyInterface {
	int MAX_VALUE = 1000 ; //선언하지 않았지만 final static 변수라는 의미.
	
	public void nonImple();
	public default void isImple( ) {
		
	}
	
	public static void staticImple() {
		
	}
	
	
}
