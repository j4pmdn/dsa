package java_dsa.leetcode.arrays;

public class MaxConsecutiveOnes485 {
	
	public static int findMaxConsecutiveOnes(int[] a) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count = 0;
            } else {
                count++;
                max = count > max ? count : max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
