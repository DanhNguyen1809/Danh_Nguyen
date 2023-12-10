package BaiTap;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	System.out.println("Nhap vao so dong a: ");
	int a = sr.nextInt();
	System.out.println("Nhap vao so hang b: ");
	int b = sr.nextInt();
	Random rd = new Random();
	
	for(int i = 0; i<a+1; i++) {
		for(int j = 0; j<=b+1; j++) {
			a = rd.nextInt(10);
			b= rd.nextInt(10);
			int[][] c = new int [i][j]; 
			System.out.println(c + "\t");
		}
		System.out.println("\n");
	}
}
}
