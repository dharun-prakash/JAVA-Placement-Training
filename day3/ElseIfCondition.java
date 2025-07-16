package day3;

import java.util.Scanner;

public class ElseIfCondition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Thriller 2 - Action 3 - Horror");
		int inp = scan.nextInt();
		if (inp == 1) {
			System.out.println("Men in Black");
		}
		else if (inp ==2) {
			System.out.println("Avengers");
		}
		else if (inp == 3) {
			System.out.println("annabell");
		}
		else {
			System.out.println("Enter the correct Input ");
		}
		
		
	}

}
