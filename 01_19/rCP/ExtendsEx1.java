package rCP;

class Child extends Parent1 {
	
}
public class ExtendsEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);
		c.action();
	}
}



//※ 자식클래스에서 부모클래스를 참조하기 위해 사용하는 참조변수는 super

//class Child2 extends Parent2 {
//	String name ="child";
//	public void method() {
//		String name="local";
//		System.out.println(name);//?
//		System.out.println(this.name);
//		System.out.println(super.name);
//	}
//}
//public class ExtendsEx2 {
//	public static void main(String[] args) {
//		Child2 c = new Child2();
//		c.method();
//	}
//}



//#자식클래스의 객체 생성시에 부모 클래스의 default 생성자가 먼저 실행되어 부모객체가 메모리에 생성됨

//class Child3 extends Parent3 {
//	Child3(){
//		System.out.println("Child3의 default 생성자 호출됨");
//	}
//}
//
//public class ExtendsEx3 {
//	public static void main(String[] args) {
//		Child3 c = new Child3();		 
//	}
//}



//#자식클래스의 생성자메서드의 첫번째 문장에서 다른 생성자를 호출하지 않으면, 컴파일시에 JDK가 부모클래스의 default 생성자 메서드를 호출하는 코드를 삽입함
//만약 부모클래스에 default 생성자 메서드가 정의되어 있지 않으면 오류 발생함
//해결 방법 1:  부모클래스에 default 생성자 메서드를 정의 (필요하지 않아도)
//해결 방법 2:  자식클래스의 생성자메서드의 첫번째 문장에서 부모클래스에 정의되어 있는 생성자 메서드를 호출 - super()

//class Child4 extends Parent4 {
//	Child4(){
//		super(1);
//		System.out.println("Child3의 default 생성자 호출됨");
//	}
//}
//
//public class ExtendsEx4 {
//	public static void main(String[] args) {
//		Child4 c = new Child4();		 
//	}
//}



//#override(재정의) 메서드 :
//부모로부터 상속받은 메서드의 선언을 동일하게 자식클래스에서 선언하고 메서드 내용을 변경할 수 있습니다.
//부모로부터 상속받은 메서드를 override(재정의) 메서드는 1개만 정의할 수 있습니다.
//-AccessModifier는 동일하거나 유효범위가 더 커야 함 (유효범위가 작으면 error)
//- 리턴타입은 반드시 동일해야 합니다. (동일하지 않으면 오류)
//- 메서드이름은 반드시 동일해야 합니다. (메서드이름이 다르면 override메서드가 아님)

//class Parent5 {	 
//	 public void info(String description) {
//		System.out.println("Parent5의 info() 호출됨");
//	}
//}
//
//class Child5 extends Parent5 {
//	public void info(String description ) {//override method
//		System.out.println("Child5에서 상속받은 info()를 version up함");		 
//	}	
//	public void info(String description , String title ) {//overload method
//		System.out.println("Child5에서 상속받은 info()를 version up함");		 
//	}
//}
//
//public class ExtendsEx5 {
//	public static void main(String[] args) {
//		Child5 c = new Child5();	
//		c.info("java");
//		c.info("java", "bit");
//	}
//}






