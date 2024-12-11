package java_dsa.test;

import java.util.Scanner;

public class Ex02OddCountArrays {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Input n:");
		int number = ip.nextInt();
		
		if(number < 0) {
			System.out.println("Arrays size must be than greater 0");
			return;
		}
		
		int[] arr = new int[number];
		System.out.println("Input the elements of arrays:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ip.nextInt();
		}
		
		System.out.println("Odd Amount Arrays is: " + oddCountArrays(arr));
		
		ip.close();
	}
	
	private static int oddCountArrays(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
}
