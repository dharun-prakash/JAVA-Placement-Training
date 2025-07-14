package Basics;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();    
//		while(n>0) {
//			System.out.println(n--);
//		}
//		though it is entry check loop if condition fails the loop will not run
		while(n<0) {
			System.out.println(n--);
		}
	}

}
