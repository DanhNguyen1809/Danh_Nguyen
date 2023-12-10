package Ex;

import java.util.Scanner;

public class Ex5 {
	public static boolean chanLe(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
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
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu nhien n: ");
		int n = sc.nextInt();
		System.out.println("n co la so chan khong: " +chanLe(n));
		System.out.println("n co phai la so nguyen to ko: " + nguyenTo(n));
	}
}
