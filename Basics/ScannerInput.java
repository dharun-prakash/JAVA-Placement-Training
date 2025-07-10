package Basics;
import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
//		System.out.println("Enter 1st number :");
//		int a = inp.nextInt();
//		System.out.println("Enter 2nd number :");
//		int b = inp.nextInt();
//		System.out.println("Enter 3rd number :");
//		int c = inp.nextInt();
//		System.out.println("Add "+a+b);
//		System.out.println("Sub "+(a-b));
//		System.out.println("Div "+a/b);
//		System.out.println("Mod "+a%c);
//		System.out.println("Mul "+b*c);
		
//		String input 
		
//		System.out.println("Enter your name :");
//		String name = inp.nextLine();
//		System.out.println("Hello ! "+name);
//		System.out.println("Enter your nickname ");
//		String nickString = inp.next();
//		System.out.println("Your nickname is "+nickString);
		
//		to get character input from the user 
		System.out.println("Enter a character : ");
		char FirstLetter = inp.next().charAt(0);
		System.out.println(FirstLetter + " is teh 1st letter");
	}

}
