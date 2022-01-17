package newEx;

import java.util.Scanner;

public class newEx4 {     //5번의 도전 횟수내에 1~100사이에 생각한 수 맞추기 게임.
	public static void main(String args[]) {
		// System.out.println((int)(Math.random()*100+1)); //바운드 값은 포함이 안되므로 0~99가 출력됨
		// 그래서 100 + 1 이다.
		
		int ranNum = ((int)(Math.random()*100+1)) ; 
		System.out.println(ranNum);

		Scanner input = new Scanner(System.in) ;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print("몇일것 같나요? : " ); 
			int num = input.nextInt();
			if (num > ranNum) {
				System.out.println("더 작은 수를 입력하세요"); 
			}
			else if (num <ranNum) {
				System.out.println("더 큰 수를 입력하세요"); 
			}
			else if (num == ranNum){
				System.out.println("정답입니다.");
				break;
			}
			System.out.println("기회가 "+(4-i)+"번 남았습니다.");
		}
		input.close();
	}
}

     