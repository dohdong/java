package pkg1;

public class Parent {    //이때는 누구나 접근이 가능했음
	public String name = "parent";    					     //  * public
}     


//public class Parent {
//	protected String name = "parent"; 						 //  * protected
//}

//
//public class Parent {
//	String name = "parent"; //default acces modifier    	 // * default
//}	

//
//public class Parent{
//	private String name = "parent";                          // * private
//	
//	public String getName() {
//		//권한 체크, 유효성 체크등
//		return name;
//	}
//	public void setName(String name) {
//		//권한체크 , 유효성 체크등
//		this.name = name;
//	}
//	
//}