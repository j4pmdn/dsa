package java_dsa.test.arrays.sort;

public class findKthLargest {
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 0;
        int result = findKthLargest(arr, k);
        System.out.println("Số lớn thứ " + k + " là: " + result);
	}
	
	private static int findKthLargest(int[] a, int k) {
		
		int n = a.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[k - 1];
	}
	

}
