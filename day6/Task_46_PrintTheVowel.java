package day6;

import java.util.Scanner;

public class Task_46_PrintTheVowel {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String :");
		String name = scan.next();
//		System.out.println(name.length());
		for (int i = 0 ; i < name.length() ; i++) {
			if ((name.charAt(i) == 'a') || (name.charAt(i) == 'e') || (name.charAt(i) == 'i') || (name.charAt(i) == 'o') || (name.charAt(i) == 'u') || (name.charAt(i) == 'A') || (name.charAt(i) == 'E') || (name.charAt(i) == 'I') || (name.charAt(i) == 'O') || (name.charAt(i) == 'U')) {
				System.out.println( name.charAt(i) + " is a Vowel");
			}
		}
		
	}

}
