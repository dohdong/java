package gInstanceof;

public class InstanceofEx {
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("1- child �� ��ȯ ����");
			
		}else {
			System.out.println("1- child �� ��ȯ ����");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("2- child �� ��ȯ ����");
	}
	
	
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);

		
	}

}