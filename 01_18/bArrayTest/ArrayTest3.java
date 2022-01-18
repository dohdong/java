package bArrayTest;



public class ArrayTest3{

	public static void main(String[] args) {
		//		int[][] nums1;
		//		int[][] nums2;
		int[][] nums3;


		//		nums1 = new int[5][5];
		//		nums2 = new int[5][ ];//행 길이 고정, 1차원 배열의 size는 동일하지 않아도 됨
		//		//nums = new int[ ][5 ]; //컴파일 오류
		nums3 = new int[ ][ ] { 
			{1},
			{1, 2},
			{1, 2, 3 },
			{1, 2, 3, 4}};

			System.out.println(nums3.length);    // 2차원 배열의 행 size
			System.out.println(nums3[0].length); // 2차원 배열의 첫번째 1차원배열의 size
			System.out.println(nums3[3].length); // 2차원 배열의 두번째 1차원배열의 size

			for(int idx = 0; idx<nums3.length; idx++) {
				for (int idx2 = 0; idx2 <nums3[idx].length; idx2++) {
					System.out.print(nums3[idx][idx2]+" ");
				}System.out.println();
			}
	}

}
