package java_dsa.test;

import java.util.Scanner;

public class Ex01MultipleOf2 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String text = "";
		
		int count = 0;
		int max = 5;
		while(true) {
			System.out.print("Nhap n: ");
			text = ip.nextLine();
			if(isNumber(text) == true) {
				break;
			}
			
			count++;
			System.out.println("Không hợp lệ, sai lần " + count);
			if(count == max) {
				System.out.println("Sai quá 5 lần, thoát chương trình");
				System.exit(0);
			}
		}
		
		int n = Integer.parseInt(text);
		if(n % 2 == 0) {
			System.out.println(n + " la boi cua 2");
		}
		
	}

	private static boolean isNumber(String n) {
		if(n == null || n.isEmpty()) {
			return false;
		}
		
		for(int i = 0; i< n.length(); i++) {
			char letter = n.charAt(i);
			if(letter < '0' || letter > '9') {
				return false;
			}
		}	
		
		return Integer.parseInt(n) > 0;
	}
	
}
