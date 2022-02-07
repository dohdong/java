package a5Data;

import java.util.Scanner;

public class DFor {

	public static void main(String[] args) {
		//배열의 크기 정하기
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오 : ");
		size = scanner.nextInt();
		String[] arr = new String[size]; 
		
		//배열에 저장할 문자열 입력받기
		System.out.println("배열에 저장할 문자열을 입력하세요 : ");
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = scanner.next();
		}
		
		//for each 문
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
