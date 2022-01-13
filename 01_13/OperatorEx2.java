
public class OperatorEx2 {
	
	public static void main(String[] args) {
		//���������. ������ �����ϸ� ����� ������ ���´�.
		int x = 3 , y = 7;
		int result = x+y;
		System.out.println(result);
		
		// �� �������� ����� boolean
		int x1 = 3 , y1 = 7;
		boolean result1 = x1>=y1;
		System.out.println(result1);
		result1 = x1 != y1;
		System.out.println(result1);
		
		// ��Ʈ ������.
		int result2 = x & y;          // 00000011 �̶� 00000111 ���ؼ� &, |, ^ 
		System.out.println(result2);  //  & �� and �ϱ� ��ġ�� 11 �� �ؼ� 3
		result2 = x | y;              //  | �� or �ϱ� 111�ؼ� 7
		System.out.println(result2);  //  ^ �� �ͽ�Ŭ��ú� or �̶� �Ȱ�ġ�� 1 ��ġ�� 0 �̶� 
		result2 = x ^ y;              //  00000100 �̶� 4.
		System.out.println(result2);	
		
		// �� ������. ����� boolean
		// && �� ��� ���϶��� ��. || �� �ϳ��� ���̸� ��. ! �� ���� �������� ������ ������.
		boolean result3 = x>=y && x<y ;
		System.out.println(result3); // false �� true �Ѵ� ������ false�� ����.
		
		// shift ������. 
		// left shift �� �������� bit�� �̵���Ű�� ������ bit�� 0���� ä��, X<<Y = X*2^y�� ����
		// ex) 00000101 �� 10100000 = 128+32 = 160 = 5 * 2^5 = 5 * 32 �� �ȴ�.
		// right shift�� ���������� bit�� �̵���Ű�� ���� bit�� sign bit�� ä��, X>>Y = X/2^y�� ����
		int result4 = x<<y ;
		System.out.println(result4);	
		x = 160; y = 3;
		result4 = x<<y ;              // 10100000000 = 1024 + 256 = 1280 ���� �´°� �ƴ�?
		System.out.println(result4);  // �̰� �� 1280 ���� �Ǵ��� Ȯ�� �տ����� 20���� ����.
		                              // << �̰Ŵ� 1280����. �ٵ� �տ����� >> �̰ɷ��߳�. ����
		result4 = x>>>y;               
		System.out.println(result4);
		x = -160;
		result2 = x>>y;
		System.out.println(result4);
		
	}

}
