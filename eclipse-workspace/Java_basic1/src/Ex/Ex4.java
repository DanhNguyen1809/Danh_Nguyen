package Ex;

import java.util.Scanner;

public class Ex4 {
	public static int lTron(float n) {
		int result1=0;
		float result = n - (int)n/1;
		if(result >= 0.5) {
			return result1 = (int)n/1 + 1;
		}else {
			result1 = (int)n/1;
		}
		return result1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n: ");
		float n = sc.nextFloat();
		System.out.println(lTron(n));
	}
}
