package ticungbim.arrays;

import java.util.Arrays;

public class _344ReverseString {

	public static void main(String[] args) {
		/*
		Example 1:

		Input: s = ["h","e","l","l","o"]
		Output: ["o","l","l","e","h"]
		
		 */
		
		char[] s = {'h','e','l','l','o'};
		
		reverseString(s);
		System.out.println("reverseString = " + Arrays.toString(s));
	}
	
	
	private static void reverseString(char[] s) {
		int n = s.length;
		int l = 0, r = n - 1;
		char temp;
		while(l < r) {
			temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++; r--;
		}
	}
	
}
