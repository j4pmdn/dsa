package java_dsa.leetcode.arrays;

public class FindNumbers1295 {
	
	/*
	 * 1295. Find Numbers with Even Number of Digits
		Example: 1
		Input: nums = [12,345,2,6,7896]
		Output: 2
		Explanation: 
		12 contains 2 digits (even number of digits). 
		345 contains 3 digits (odd number of digits). 
		2 contains 1 digit (odd number of digits). 
		6 contains 1 digit (odd number of digits). 
		7896 contains 4 digits (even number of digits). 
		Therefore only 12 and 7896 contain an even number of digits.
		
		-> Tìm số chữ số của 1 chữ số
		  -> số chữ số = chữ số / 10
		  -> số chữ số = log10(n) + 1
	 */
	
	public static void main(String[] args) {
		int [] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}
	
	
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(countOfNumber(nums[i]) % 2 == 0) {
				count++;
			}
		}
		return count;
        
    }
	
	private static int countOfNumber(int n) {
		int count = 0;
		while(n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
