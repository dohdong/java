package aDataType;

public class DataType1 {
	
	public static void main(String[] args) {
		// primitive data type == primitive data type 는 값을 비교
		// reference data type == reference data type 는 주소값을 비교
		
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 =  "java";
		String s4 =  "java";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4); // String pool 에 저장되어있어서 같은걸 가리킴. 
									// 주고 마저 같음.
		
		
		
	}

}
