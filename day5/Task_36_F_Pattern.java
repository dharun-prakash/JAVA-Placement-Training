package day5;

import java.util.Scanner;

public class Task_36_F_Pattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 0; i<a ; i++) {
				for(int j = 0 ; j <a;j++) {
					if (j==0 || i == a/2 || i==0 ) {
					System.out.print("*");
				}
		
					
			}
				System.out.println();
		}
		
		
	}

}
