package aCreate;

import java.util.Random;

public class Array {
	private int row;
	private String title;
	private int col;
	private int[][] array;

	public Array(String title, int row, int col) {
		this.title=title;
		this.row=row;
		this.col=col;
		array= new int[row][col];

		// 여기서 배열을 초기화 하는것이 적합한 위치이다.
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row=row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int[][] getArray(){
		return array;
	}

	public void setArray(int[][] array) {
		this.array=array;
	}

	public void makeArrayData() {
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				array[r][c]=this.getRandomNumber();
			}
		}
	}



	private int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(row*col)+1;
	}

	public void printArray() {
		System.out.println("##" +title+ " 출력");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print(array[r][c]+" ");
			}
			System.out.println();
		}
	}

	public void findMatchNumber(Array src , Array desc) {
		int count = 0;
		System.out.print("## 일치하는 숫자 : ");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				if(src.getArray()[r][c]==desc.getArray()[r][c]) {
					System.out.printf("[%1$d][%2$d] = %3$d," , r,c,src.getArray()[r][c]);
					count+=1;
				}
			}
		}
		System.out.println("\n##일치하는 숫자 갯수 : "+count);

	}

}

		


