package Ex;

import java.util.Scanner;

public class ex1 {
	public static char[] chuyenDoi(String a) { //phuong thuc chuyen doi
		char[] result = new char[a.length()];
		for(int i = 0; i<result.length; i++) {
			result[i] = a.charAt(i);
		}
		return result;
		
	}
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhay vao chuoi: ");
		s = sc.nextLine(); // nhap vao chuoi
		char[] c = chuyenDoi(s); // chuyen doi chuoi s thanh char c
		for(char i : c) {
			System.out.println(i + " ");
		}
	}
}
