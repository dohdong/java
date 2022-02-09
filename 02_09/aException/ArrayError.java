package aException;

public class ArrayError {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5} ;
		int i = 0;  //main에서 사용하는 level의 i , 따라서 밑에 catch에서도 i를 쓸 수 있다.
					//for (int i = 0; ~~ ) 로 선언하게 되면 for문 안에서 밖에 i를 쓰지 못하므로 
					//main에서 선언해서 main 내부에서 for문 밖에서도 사용가능. (하지만 그냥 자기 스타일임.)
		
		try {
			for (i=0; i<= array.length; i++)
				System.out.print(array[i]+ " ");
		}catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("인덱스"+i+"는 사용할수없다." );
		}
	}

}
