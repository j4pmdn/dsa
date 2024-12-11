package java_dsa.leetcode.arrays;

public class _27RemoveElements {
	
	public static void main(String[] args) {
		// Kĩ thuật: Duyệt bằng 2 chỉ số trên 1 mảng
		// a[i]: dùng để duyệt mảng
		// a[curIndex]: sử dụng xác định phần tử đúng cho vào vị trí curIndex
		
		// B1: cho i chạy từ 0 -> n-1
		// B2: Nếu gặp a[i] != val thì gán vào a[curIndex] sau đó tăng curIndex lên 1 
		
		int[] nums = {3,2,2,3};
		
		removeElement(nums, 3);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
	
	public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int curIndex = 0;
        for(int i=0; i < n;i++) {
        	if(nums[i] != val) {
        		nums[curIndex] = nums[i];
        		curIndex++;
        	}
        }
        return curIndex;
    }
	
}
