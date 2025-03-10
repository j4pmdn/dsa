package ticungbim.arrays;

import java.util.Arrays;

public class _1480RunningSumOf1DArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println("sum = " + Arrays.toString(runningSum(nums)));
	}	
	
	private static int[] runningSum(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			nums[i] += nums[i-1];
		}
		return nums;
	}
	
}
