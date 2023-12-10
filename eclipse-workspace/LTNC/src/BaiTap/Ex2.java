package BaiTap;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Nhap vao a: ");
		int a = sr.nextInt();
		
		System.out.println("Nhap vao b: ");
		int b = sr.nextInt();
		
		System.out.println("Nhap vao c: ");
		int c = sr.nextInt();
		int detal = b*b - 4*a*c;
		
		if(detal <0 ) {
			System.out.println("Phuong Trinh Vo Nghiem");
		}else if(detal > 0 ){
			System.out.println("Phuong trinh hai nghiem phan biet: x1 = " + (-b+ Math.sqrt(detal))/2*a + "/n x2 =" +  (-b - Math.sqrt(detal))/2*a);
			
		}else if(detal == 0){
			System.out.println("Phuong trinh co nghiem kep : x =" + -b/2*a);
		}
	}
}
