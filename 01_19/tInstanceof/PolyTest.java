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
	public void method() { //override �޼���
		System.out.println("child's method() called");
	}
	public void dance() {
		System.out.println("child's dance() called");
	}
	
}


public class PolyTest {

	public static void main(String[] args) {
		Parent8 p = new Child8();   //������ ��ü
		System.out.println(p.num);	//����ʵ�� ������ �켱
		System.out.println(p.age);
		//System.out.println(p.phone);			// error
		System.out.println(((Child8)p).phone);  // ������ ��ü��
		p.method(); 					// ������ ��ü�� override �޼��尡 �켱�̶� �ڽ��� ȣ���.
		p.sound();
		((Child8)p).dance(); // ������ ��ü�� �θ� ������� ���� �ʵ�� �޼���� 
					// ������ ��ü�� Down Casting�� �ؾ� ��� ����
		

	}

}






