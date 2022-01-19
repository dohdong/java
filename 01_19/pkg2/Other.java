package pkg2;

import pkg1.Parent;

public class Other  {
	public void test() {
		Parent p = new Parent();
		System.out.println(p.name);  // 뭐임 그럼 other는 child 에서 상속 받고 나서도 안됨?
	}
	public static void main(String[] args) {
		Other o = new Other();
		o.test();
	}

}
