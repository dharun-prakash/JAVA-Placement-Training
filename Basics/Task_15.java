package Basics;

import java.util.Scanner;

public class Task_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - movies 2 - exit");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("1 - Tamil 2 - English 3 - Malayalam");
			int mov = scan.nextInt();
			if (mov == 1) {
				System.out.println("Coolie");	
			}
			else if (mov == 2) {
				System.out.println("Avengers");
				
			}
			else if (mov == 3) {
				System.out.println("Premam");
			}
			else {
				System.out.println("Invalid Number");
			}
			System.out.println();
		}
		else if (choice == 2) {
			System.out.println("Thank You Please come Again");
			
		}
		
		
		else {
			System.out.println("Enter Valid number");
		}
		
	}

}
