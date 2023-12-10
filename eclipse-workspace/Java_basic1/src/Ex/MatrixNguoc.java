package Ex;

import java.util.Scanner;

public class MatrixNguoc {
	public static void matric(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=i-1; j>=0; j--) {
				System.out.print(" "+" ");
			}
			for(int j=i; j<matrix.length; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void denta(int[][] matrix) {
		for(int i=0; i<matrix.length; i++){
			for(int j=matrix.length; j<i;j--) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void matrix2(int matrix[][]) {
		for(int i = 0; i<matrix.length;i++) {
			for(int j = i+1; j<matrix.length; j++) {
				System.out.print(" "+" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao row: ");
//		int row = sc.nextInt();
//		System.out.println("Nhap vao cul: ");
//		int cul = sc.nextInt();
//		int[] arr = {3, 4, 4, 5};
		int[][] matrix = new int[4][4];
		matric(matrix);
		matrix2(matrix);
		denta(matrix);
	}
}
