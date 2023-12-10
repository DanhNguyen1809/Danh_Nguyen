package Ex;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int count = 0; // dem ngay co nhiet do tren trung binh
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("Nhap vao so Ngay: ");
		x = sc.nextInt();
		
		int result[] = new int[x];
		for(int i = 0; i<x; i++) {
			if(i<x) {
				System.out.println("Nhap vao nhiet do Ngay"+i +": ");
				result[i] = sc.nextInt();
			}
			if((double) result[i] >= 17.6) {
				count++;
			}
		}
		System.out.println("So ngay co nhiet do tren trung binh: " +count);
		
		//ex3
		double sum = 0; // tong
		double divide = 0; //trung binh
		for(int i = 0; i<x; i++) {
			sum+=Math.pow((double) result[i] - 17.6 , 2);
			divide = sum/x;
		}
		System.out.println("Do lech chuan : " + Math.sqrt(divide));
	}
}
