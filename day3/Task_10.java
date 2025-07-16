package day3;
import java.util.Scanner;



public class Task_10 {
	public static void main(String[] args) {
		
		// Convert a to A without in build function lower case to upper case
		
//		Scanner scan = new Scanner(System.in);
//		String inp = scan.next();
//		char value = inp.charAt(0);
//		int num = ((int)value) - 32;
//		System.out.println((char)num);
		
		// Convert a to A without innbuild function upper case to lower case
		
//		Scanner scan = new Scanner(System.in);
//		String inp = scan.next();
//		char value = inp.charAt(0);
//		int num = ((int)value) + 32;
//		System.out.println((char)num);
		
		// Convert a to A without innbuild function upper case to lower case or lower case to upper case
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char inp = scan.next().charAt(0);
		int num = ((int)inp) ^ 32;
		System.out.println((char)num);
		
	}

}
