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



//�� �ڽ�Ŭ�������� �θ�Ŭ������ �����ϱ� ���� ����ϴ� ���������� super

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



//#�ڽ�Ŭ������ ��ü �����ÿ� �θ� Ŭ������ default �����ڰ� ���� ����Ǿ� �θ�ü�� �޸𸮿� ������

//class Child3 extends Parent3 {
//	Child3(){
//		System.out.println("Child3�� default ������ ȣ���");
//	}
//}
//
//public class ExtendsEx3 {
//	public static void main(String[] args) {
//		Child3 c = new Child3();		 
//	}
//}



//#�ڽ�Ŭ������ �����ڸ޼����� ù��° ���忡�� �ٸ� �����ڸ� ȣ������ ������, �����Ͻÿ� JDK�� �θ�Ŭ������ default ������ �޼��带 ȣ���ϴ� �ڵ带 ������
//���� �θ�Ŭ������ default ������ �޼��尡 ���ǵǾ� ���� ������ ���� �߻���
//�ذ� ��� 1:  �θ�Ŭ������ default ������ �޼��带 ���� (�ʿ����� �ʾƵ�)
//�ذ� ��� 2:  �ڽ�Ŭ������ �����ڸ޼����� ù��° ���忡�� �θ�Ŭ������ ���ǵǾ� �ִ� ������ �޼��带 ȣ�� - super()

//class Child4 extends Parent4 {
//	Child4(){
//		super(1);
//		System.out.println("Child3�� default ������ ȣ���");
//	}
//}
//
//public class ExtendsEx4 {
//	public static void main(String[] args) {
//		Child4 c = new Child4();		 
//	}
//}



//#override(������) �޼��� :
//�θ�κ��� ��ӹ��� �޼����� ������ �����ϰ� �ڽ�Ŭ�������� �����ϰ� �޼��� ������ ������ �� �ֽ��ϴ�.
//�θ�κ��� ��ӹ��� �޼��带 override(������) �޼���� 1���� ������ �� �ֽ��ϴ�.
//-AccessModifier�� �����ϰų� ��ȿ������ �� Ŀ�� �� (��ȿ������ ������ error)
//- ����Ÿ���� �ݵ�� �����ؾ� �մϴ�. (�������� ������ ����)
//- �޼����̸��� �ݵ�� �����ؾ� �մϴ�. (�޼����̸��� �ٸ��� override�޼��尡 �ƴ�)

//class Parent5 {	 
//	 public void info(String description) {
//		System.out.println("Parent5�� info() ȣ���");
//	}
//}
//
//class Child5 extends Parent5 {
//	public void info(String description ) {//override method
//		System.out.println("Child5���� ��ӹ��� info()�� version up��");		 
//	}	
//	public void info(String description , String title ) {//overload method
//		System.out.println("Child5���� ��ӹ��� info()�� version up��");		 
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






