package pkg1;


public class Other {   //���� package������ ����� ���? �� �ǰ�? 
	public void test() {
		Parent p = new Parent();
		System.out.println(p.name); 
	}
	public static void main(String[] args) {
		Other o = new Other();
		o.test();
	}

}
