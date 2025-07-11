package Basics;
import java.util.Scanner;

public class Task_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Charactere : ");
		char var = scan.next().charAt(0);
		if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u' || var == 'A' || var == 'E' || var == 'I' || var == 'O' || var == 'U') {
			System.out.println(var + " is a Vowel");		
		}
		else {
			System.out.println(var + " is not a vowel");
		}
		
	}

}
