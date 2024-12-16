package java_dsa.test;

public class Ex03ConvertDecimalToBinary {
	
	public static void main(String[] args) {
		int decimal = 11;
		System.out.println("Binary code of " + decimal + " = " + convert(decimal));
	}
	
	private static String convert(int decimal) {
		String binaryString = "";
		while(decimal > 0) {
			int modPart = decimal % 2;
			binaryString = modPart + binaryString;
			decimal /= 2;
		}
		return binaryString.toString();
	}
	
}
