package bArrayTest;



public class ArrayTest1 {

	public static void main(String[] args) {
		int[] nums;   //����
		int[] nums2;
		nums = new int[5];  //����, default �ʱⰪ���� �ʱ�ȭ ��.
		nums2 = new int[] {100,200,300}; //����, ����� �ʱ�ȭ, 1���� �迭
		System.out.println(nums.length);
		System.out.println(nums2.length);
		System.out.println(nums2[2]);
		
		// ��� �Ϸ��� �Ʒ�ó�� �ؾ��ϳ���.
		for(int idx = 0; idx<nums.length; idx++) {
			System.out.print(nums[idx]+" ");
		}
		System.out.println();
		
		for (int n : nums2) { // ������ ���ٸ� ����, advanced for��
			System.out.print(n+" ");
		}

	}

}
