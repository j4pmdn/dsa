package java_dsa.sort;

public class Sort {
	
	private static void printArray(int no, int[] a) {
		System.out.printf("%d: ", no);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]); 
		}
		System.out.println();
	}
	
	private static void bubleSort(int [] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean isSorted = true;
			for(int j = 0; j < n-i-1; j++) {
				if(a[j] > a[j+1]) {
					isSorted = false;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}	
			printArray(i, a);
			if(isSorted) {
				break;
			}
		}
	}
	
	private static void insertionSort(int[] a) {
		int n = a.length;
		for(int i = 1;i < n; i++) {
			// chen a[i] vao day 0 -> i-1
			int ai = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > ai) {
				a[j+1] = a[j];
				j--;	
			}
			a[j+1] = ai;
			printArray(i, a);
		}
	}
	
	private static void selectionSort(int[] a) {
		int n = a.length;
		for(int i = 0;i < n; i++) {
			int minIndex = i;
			for(int j = i + 1; j<n;j++) {
				// Tim min [i, n]
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
			printArray(i, a);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {5, 3, 2, 7, 8, 1, 2};
//		int [] b = {1, 2, 3, 4, 5, 6, 8, 7};
//		bubleSort(a);
//		insertionSort(a);
		selectionSort(a);
	}
	
}
