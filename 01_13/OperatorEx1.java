
public class OperatorEx1 {
	
	public static void main(String[] args) {
		//sign(+,-), 1의 보수(~), 증감연산자(++,--), not연산자(!), ()
		
		int num = 3;
		//num = -num;
		System.out.println(~num);
		int a = ++num; //전위연산 먼저 num을 증가시키고 a를 저장함.
		System.out.println("num="+num+", "+"a="+a);
		a = num++;     //후위연산 a에 num을 저장하고 나서 num을 증가시킴. 
		System.out.println("num="+num+", "+"a="+a);
		// 그래서 출력된값이 num=5, a=4 로 a는 4인데, 그 다음줄 이므로 num은 증가되어서 5임.
		
		int x = 3 , y = 3 ;
		a = ++x + ++y;
		System.out.println("x="+x+"," +" y="+y+", a="+a);
		a = x++ + y++;
		System.out.println("x="+x+"," +" y="+y+", a="+a);
		boolean flag = false;
		System.out.println(!flag);
		
		
		
		
		
	}

}
