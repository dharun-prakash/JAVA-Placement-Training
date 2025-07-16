package day4;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		though it is a exit level check loop it will check the condition after the statement is executed
		int n = scan.nextInt();
		do {
			System.out.println(n);
			n--;	
		}while(n>0);
	}

}
