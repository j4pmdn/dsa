package java_dsa.test;

import java.util.Arrays;

public class RemoveElementArrays {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        arr = removeElement(arr, 2); // Xóa phần tử ở index 2 (giá trị 3)
        System.out.println(Arrays.toString(arr)); // [1, 2, 4, 5]
	}
	
	private static int[] removeElement(int a[], int index) {
		int n = a.length;

		if(index < 0 || index > n) {
			throw new IllegalArgumentException("chỉ mục ko hợp lệ");
		}
		
		int[] newArr = new int [n-1];
		
		for(int i = 0, j = 0; i < n; i++) {
			if(i != index) {
				newArr[j++] = a[i];
			}
		}
		return newArr;
	}
	
}
