package Ex;

import java.util.Scanner;

public class Ex12 {
	public static char[][] maHoa(String a,int collum){
		int count = 0;
		
		int row;
		if(a.length()%collum==0) {
			row = a.length()/collum; 
		}else {
			row = a.length()/collum+1;
		}
		char[][] arr = new char[row][collum];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; i<arr[i].length; j++) {
				if(a.charAt(count) == ' ') {
					arr[i][j] = '-';
				}else {
					arr[i][j] = a.charAt(count);
				}
				count++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chuoi: ");
		String chuoi = sc.nextLine();
		char[][] a = maHoa(chuoi, 5);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
