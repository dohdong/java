package aException;

public class ArrayError {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5} ;
		int i = 0;  //main���� ����ϴ� level�� i , ���� �ؿ� catch������ i�� �� �� �ִ�.
					//for (int i = 0; ~~ ) �� �����ϰ� �Ǹ� for�� �ȿ��� �ۿ� i�� ���� ���ϹǷ� 
					//main���� �����ؼ� main ���ο��� for�� �ۿ����� ��밡��. (������ �׳� �ڱ� ��Ÿ����.)
		
		try {
			for (i=0; i<= array.length; i++)
				System.out.print(array[i]+ " ");
		}catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("�ε���"+i+"�� ����Ҽ�����." );
		}
	}

}
