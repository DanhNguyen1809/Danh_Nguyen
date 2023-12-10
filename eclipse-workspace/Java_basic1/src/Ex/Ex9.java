package Ex;

import java.util.Scanner;

public class Ex9 {
	public static boolean nguyenTo(int a) {
		if(a<=1) return false;
		for(int i=2; i<a/2; i++) {
			if(a==2) return true;
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void sNguyenTo(int a, int b) {
		int cur = a+1;
		int count = 0;
		while (count<b) {
			if(nguyenTo(cur)) {
				System.out.println(cur +" ");
				count++;
			}
			cur++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen a: ");
		int a=sc.nextInt();
		System.out.println("Nhap b so nguyen: ");
		int b=sc.nextInt();
		sNguyenTo(a, b);
	}
}
