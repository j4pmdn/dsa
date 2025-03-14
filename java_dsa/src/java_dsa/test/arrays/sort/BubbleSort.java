package java_dsa.test.arrays.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 11, 90};
        bubleSort1(a);
        for(int num: a) {
        	System.out.print(num + " ");
        }
	}
	
	// bubble sort
	private static void bubleSort1(int [] a) {
		int n = a.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
}
