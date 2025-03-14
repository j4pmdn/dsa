package java_dsa.test;

import java.util.Arrays;

public class InsertElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5};
        arr = insertElement(arr, 2, 3); // Chèn số 3 vào vị trí index 2
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
        
	}
	
	private static int[] insertElement(int[] a, int index, int value) {

		int[] newArr = new int [a.length + 1];
		for(int i = 0, j = 0; i < newArr.length; i++) {
			if(i == index) {
				newArr[i] = value;
			} else {
				newArr[i] = a[j++];
			}
		}
		return newArr;
	}
	
}
