package Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	//a viet tao mang 2 chieu
	public static int[] arrayPlus(int[] arr1, int[] arr2) {
		int[] result = new int[0];
		if(arr1.length > arr2.length) {
			result = arr1;

			for(int i= 0; i<arr2.length; i++) {
				result[i] += arr2[i];
			}
		}else {
			result = arr2;
			for(int i= 0; i<arr1.length; i++) {
				result[i] += arr1[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao chieu dai arr1 : ");
		int a = sc.nextInt();
		int[] arr1 = new int[a];
		for(int i=0; i<arr1.length; i++) {
			System.out.print("nhap vao phan tu "+ (i+1));
			arr1[i]= sc.nextInt();
		}
		
		System.out.println("nhap vao chieu dai arr2 : ");
		int b = sc.nextInt();
		int[] arr2 = new int[b];
		for(int i=0; i<arr2.length; i++) {
			System.out.print("Nhap vao phan tu " + (i+1));
			arr2[i]=sc.nextInt();
		}
		
		int[] sum = arrayPlus(arr1, arr2);
		//System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(sum));
	}
		
}
