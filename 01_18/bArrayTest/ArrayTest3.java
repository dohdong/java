package bArrayTest;



public class ArrayTest3{

	public static void main(String[] args) {
		//		int[][] nums1;
		//		int[][] nums2;
		int[][] nums3;


		//		nums1 = new int[5][5];
		//		nums2 = new int[5][ ];//�� ���� ����, 1���� �迭�� size�� �������� �ʾƵ� ��
		//		//nums = new int[ ][5 ]; //������ ����
		nums3 = new int[ ][ ] { 
			{1},
			{1, 2},
			{1, 2, 3 },
			{1, 2, 3, 4}};

			System.out.println(nums3.length);    // 2���� �迭�� �� size
			System.out.println(nums3[0].length); // 2���� �迭�� ù��° 1�����迭�� size
			System.out.println(nums3[3].length); // 2���� �迭�� �ι�° 1�����迭�� size

			for(int idx = 0; idx<nums3.length; idx++) {
				for (int idx2 = 0; idx2 <nums3[idx].length; idx2++) {
					System.out.print(nums3[idx][idx2]+" ");
				}System.out.println();
			}
	}

}
