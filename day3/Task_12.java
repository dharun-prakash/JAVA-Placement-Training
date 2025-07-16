package day3;
import java.util.Scanner;

public class Task_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int inp = scan.nextInt();
		if(inp%2==0) {
			System.out.println(inp + " is even");
		}
		else {
			System.out.println(inp + " is odd");
		}
		
	}

}
