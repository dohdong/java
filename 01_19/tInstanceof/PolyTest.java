package tInstanceof;

class Parent8 {
	int num = 1;
	int age = 1;
	public void method() {
		System.out.println("parent's method() called");
	}
	public void sound() {
		System.out.println("parent's sound() called");
	}
	
	
}

class Child8 extends Parent8 {
	int num = 100;
	int phone = 0;
	public void method() { //override 메서드
		System.out.println("child's method() called");
	}
	public void dance() {
		System.out.println("child's dance() called");
	}
	
}


public class PolyTest {

	public static void main(String[] args) {
		Parent8 p = new Child8();   //다형성 객체
		System.out.println(p.num);	//멤버필드는 선언자 우선
		System.out.println(p.age);
		//System.out.println(p.phone);			// error
		System.out.println(((Child8)p).phone);  // 다형성 객체를
		p.method(); 					// 다형성 객체는 override 메서드가 우선이라 자식이 호출됨.
		p.sound();
		((Child8)p).dance(); // 다형성 객체는 부모에 선언되지 않은 필드와 메서드는 
					// 다형성 객체를 Down Casting을 해야 사용 가능
		

	}

}






