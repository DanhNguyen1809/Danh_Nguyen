package Ex;

import java.util.Scanner;

public class ex7 {
	public static int demChuSO(int a) {
		int count = 0;
		while (a!=0) {
			count++;
			a/=10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		int a = sc.nextInt();
		
		System.out.println("so chu so cua a la: " +demChuSO(a));
	}
}
