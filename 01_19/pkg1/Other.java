package pkg1;


public class Other {   //같은 package에서는 상속이 없어도? 잘 되고? 
	public void test() {
		Parent p = new Parent();
		System.out.println(p.name); 
	}
	public static void main(String[] args) {
		Other o = new Other();
		o.test();
	}

}
