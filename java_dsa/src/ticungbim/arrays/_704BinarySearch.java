package ticungbim.arrays;

public class _704BinarySearch {
	
	public static void main(String[] args) {
		int[] a = {-1,0,3,5,9,12};
		System.out.println(binarySearch(a, 2));
	}
	
	private static int binarySearch(int[] a, int target) {
		int l = 0;
		int n = a.length;
		int r = n - 1;
		
		while(l < r) {
			int m = l + (r - l)/2;
			if(a[m] == target) {
				return m;
			} else if (a[m] < target) {
				l = m + 1;
			} else {
				r = m + 1;
			}
		}
		
		return -1;
	}
	
}
