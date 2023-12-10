package Ex;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
	public static void printMatrix(int[][] matrix) {
		Random rd = new Random();
		for(int i=0; i<matrix.length;i++) {
			System.out.println();
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = rd.nextInt(30);
				System.out.print("\t" +matrix[i][j]+"\t");
			}
		}
	}
	
	public static int[][] createPasscal(int size){
		int arr[][] = new int[size][];
		for(int i=0; i<arr.length;i++) {
			arr[i]=new int[i+1];
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print((j+1) + " ");
			}
			System.out.println("\n");
		}
		return arr;
	}
	
	public static int[][] createPasscal2(int[] diavaleu){
		int n = diavaleu.length;
		int[][] passcal = new int[n][n];
		for(int i=0; i<passcal.length; i++) {
//			passcal[i]=new int[i+1];
			passcal[i][i] = diavaleu[i];
		}
		
		for(int i=0; i<passcal.length; i++) {
			
			for(int j = i-1; j>=0;j--) {
				passcal[i][j] = passcal[i][j+1]-1;
			}
			
			for(int j = i+1; j<n;j++) {
				passcal[i][j] = passcal[i][j-1]+1;
			}
		}
		
		return passcal;
		
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao so dong: ");
//		int dong = sc.nextInt();
//		System.out.println("Nhap vao so cot: ");
//		int cot = sc.nextInt();
//		int[][] matrix = new int[dong][cot];
//		//printMatrix(matrix);
//		System.out.println("Nhap vao chieu dai cua tam giac: ");
//		int c = sc.nextInt();
//		System.out.println(createPasscal(c));
		int[] trix =  {1,5,2,0};
		int[][] matrix2 = createPasscal2(trix);
		for(int i=0; i<matrix2.length;i++) {
			for(int j =0; j<matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] +"\t" );
			}
			System.out.println();
		}
	}
}
