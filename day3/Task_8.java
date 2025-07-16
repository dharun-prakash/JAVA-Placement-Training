package day3;
import java.util.Scanner;

public class Task_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter A number :");
		int a = scan.nextInt();
		System.out.println("Enter B number :");
		int b = scan.nextInt();
		System.out.println("Enter C number :");
		int c = scan.nextInt();
		System.out.println((a > b ) && (a > c) ? "A is Greater Number" : (b > a ) && (b > c) ? " B is Greater Number " : "C is Greater Number" );
		
	}

}
