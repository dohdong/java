package bArrayTest;



public class ArrayTest1 {

	public static void main(String[] args) {
		int[] nums;   //선언
		int[] nums2;
		nums = new int[5];  //생성, default 초기값으로 초기화 됨.
		nums2 = new int[] {100,200,300}; //생성, 명시적 초기화, 1차원 배열
		System.out.println(nums.length);
		System.out.println(nums2.length);
		System.out.println(nums2[2]);
		
		// 출력 하려면 아래처럼 해야하나봄.
		for(int idx = 0; idx<nums.length; idx++) {
			System.out.print(nums[idx]+" ");
		}
		System.out.println();
		
		for (int n : nums2) { // 순차적 접근만 가능, advanced for문
			System.out.print(n+" ");
		}

	}

}
