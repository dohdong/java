package newEx;

public class newEx1  {

	public static void main(String[] args) {
		int num,count,i;
		
		for(num=2 ; num<=100; num++) { //2부터 100까지 
			count = 0;
			
			for(i=2; i<num; i++) 
				if(num%i == 0)   // 나누어 지면 카운트.
					count = count+i;
			if(count==0)
				System.out.print(num+" ");
		}
	}
}
