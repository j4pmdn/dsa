package java_dsa.test;

public class CountWordsInString {
	
	public static void main(String[] args) {
		System.out.println(countWords("Hello", 'H'));
	}
	
	private static int countWords(String s, char w) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == w) {
				count++;
			}
		}
		return count;
	}

}
