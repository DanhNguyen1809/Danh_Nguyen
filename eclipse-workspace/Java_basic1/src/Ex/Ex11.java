package Ex;

import java.util.Scanner;

public class Ex11 {
	public static String date(String data) {
		String[] past = data.split("/");
		String result = " ";
		int day = Integer.parseInt(past[0]);
		int month = Integer.parseInt(past[1]);
		int year = Integer.parseInt(past[2]);
		switch (month) {
		case 1:
			result = "January";
			break;
		case 2:
			result = "February";
		}
		return day+" "+result+" "+year;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao date");
		String date = sc.nextLine();
		System.out.println(date(date));
	}
}
