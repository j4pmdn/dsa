package java_dsa.test.arrays.sort;

public class MostFrequentElement {
	
	public static void main(String[] args) {
        int[] a = {1, 3, 2, 1, 4, 1, 3, 2};
        
        System.out.println(mostFrequentElement(a));
	}
	
	private static int mostFrequentElement(int[] a) {
		int n = a.length;
		int maxCount = 0;
		int mostFrequentNum = a[0];
		
		for(int i = 0; i < n; i++) {
			
			int count = 1;
			for(int j = i+1; j < n; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			
			if(count > maxCount) {
				maxCount = count;
				mostFrequentNum = a[i];
			}
		}
		return mostFrequentNum;
	}
	

}
