package java_dsa.leetcode.arrays;

public class _26RemoveDuplicatesFromSorted {
	
	/**
	 Kỹ thuật: Duyệt bằng 2 chỉ số trên 1 mảng
	 a[i] -> sử dụng để duyệt mảng
	 a[curIndex] -> sử dụng để xác định phần tử Đúng vào vị trí Index
	 
	 B1: Cho i chạy từ 0 -> n -1
	 B2: Nếu gặp a[i] != a[curIndex] thì tăng curIndex lên 1
	  sau đó gán a[curIndex] = a[i]
	 
	 * @param args
	 */
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,5};
		System.out.println(removeDuplicates(nums));
	}
	
	
	public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 0; i< nums.length;i++) {
        	if(nums[i] != nums[index]) {
        		index++;
        	}
        	nums[index] = i;
        }
        return index;
    }
		
}	
