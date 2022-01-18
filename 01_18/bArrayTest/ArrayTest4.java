package bArrayTest;



public class ArrayTest4{

	public static void main(String[] args) {
		int[] nums1;
		int[] nums2;
		
		nums1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		nums2 = new int[] {100,100,100,100,100,100,100,100,100,100};

//      이렇게 좀 예쁘게 만들수 있다.		
//		int[] src = new int[10];  
//		int[] target = new int[10];
//		for(int idx=0;idx<src.length;idx++) {
//		    src[idx] = idx+1;
//	        target[idx] = 100;
//		}		
		
		for(int idx = 0; idx<nums2.length; idx++) {
			System.out.print(nums2[idx]+" ");
		}System.out.println();
		
		System.arraycopy(nums1, 4, nums2, 2, 4 ); 
		//(복사할 객체, 복사 시작index , target배열 객체 , 붙여넣기시작 index , 요소 개수)
		
		for(int idx = 0; idx<nums2.length; idx++) {
			System.out.print(nums2[idx]+" ");
		}
		
		
	}

		

}
