package newEx;

public class newEx1  {

	public static void main(String[] args) {
		int num,count,i;
		
		for(num=2 ; num<=100; num++) { //2���� 100���� 
			count = 0;
			
			for(i=2; i<num; i++) 
				if(num%i == 0)   // ������ ���� ī��Ʈ.
					count = count+i;
			if(count==0)
				System.out.print(num+" ");
		}
	}
}
