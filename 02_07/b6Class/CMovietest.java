package b6Class;

import java.util.Scanner;

public class CMovietest {

	public static void main(String[] args) {
		CMovie m = new CMovie();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("발표연도와 영화 제목을 입력하세요:  ");
		m.pyear = scanner.nextInt();
		scanner.nextLine();          //이게 필요함...  처음에 숫자를 치면 Int에 잘 들어가는데
									 // 그 후 엔터를 치면 nextLine에 들어간다. 그래서 한 줄 더 필요함.
		m.title = scanner.nextLine(); 
		
		System.out.println(m.print());
		
		
		
	}

}
