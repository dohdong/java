package aDataType;


public class DataType2 {

	public static void main(String[] args) {
		String s = null;  //참조변수는 생성전에 null을 할당해서 참조변수를 초기화함.
		int num = 0;      // 로컬 변수는 사용전에 반드시 초기화 해야함.
		System.out.println(num);
		System.out.print(s);
		//System.out.println(s.length()); // 오류 발생.
		 // NullPointerException은 객체를 생성하지 않은채 매서드를 호출했을때 발생. 
		

	}

}
