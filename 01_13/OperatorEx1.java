
public class OperatorEx1 {
	
	public static void main(String[] args) {
		//sign(+,-), 1�� ����(~), ����������(++,--), not������(!), ()
		
		int num = 3;
		//num = -num;
		System.out.println(~num);
		int a = ++num; //�������� ���� num�� ������Ű�� a�� ������.
		System.out.println("num="+num+", "+"a="+a);
		a = num++;     //�������� a�� num�� �����ϰ� ���� num�� ������Ŵ. 
		System.out.println("num="+num+", "+"a="+a);
		// �׷��� ��µȰ��� num=5, a=4 �� a�� 4�ε�, �� ������ �̹Ƿ� num�� �����Ǿ 5��.
		
		int x = 3 , y = 3 ;
		a = ++x + ++y;
		System.out.println("x="+x+"," +" y="+y+", a="+a);
		a = x++ + y++;
		System.out.println("x="+x+"," +" y="+y+", a="+a);
		boolean flag = false;
		System.out.println(!flag);
		
		
		
		
		
	}

}
