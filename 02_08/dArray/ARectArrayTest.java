package dArray;

public class ARectArrayTest {

	public static void main(String[] args) {
		ARect[] list = new ARect[5];
		
		for (int i =0 ; i<list.length; i++)
			list[i] = new ARect(i, i+1);
		
		for (int i =0 ; i<list.length; i++)
			System.out.println(i+"��° �簢���� ���� =" +list[i].calcArea());
		
		
	}

}
