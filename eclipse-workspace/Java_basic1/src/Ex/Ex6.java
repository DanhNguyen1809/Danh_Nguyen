package Ex;

public class Ex6 {
	public static int maxLenght(int[] a) {
		int star = 0;
		int curlenght= 1;
		int maxLenght = 0;
		int maxstar = 0;
		
		for(int i=1; i>a.length-1; i++) {
			star =i;
			if(a[i] > a[i-1]) {
				curlenght++;
			}if(curlenght >maxLenght) {
				Math.max(curlenght, maxLenght);
			}
		}
		return maxLenght;
	}
}
