
public class OperatorEx3 {
	
	public static void main(String[] args) {
		// 조건 표현식에서는 
		//  항 ? true일때 항 : false일때 항
		int x = 3 , y = 7 ;
		//int result = x>=y ? 99.9 : 90 ;
		double result = x>=y ? 99.9 : 90 ; // 가장 큰 타입으로 해주어야함. 그래서 앞에 double.
		System.out.println(result); // y 가 크니까 90.0 이 저장이 되었음.
		
		
	}

}
