package Basics;

import java.util.Scanner;

public class Task_35_E_Pattern {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for(int i = 1; i<=a ; i++) {
//			if(i%2!=0) {
//
//				for(int j = 0 ; j <a;j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				System.out.print("*");
//
//			}
//			System.out.println();
//			
//		}
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 0; i<a ; i++) {
				for(int j = 0 ; j <a;j++) {
					if (j==0 || i == a/2 || i == a-1 || i==0 ) {
					System.out.print("*");
				}
		
					
			}
				System.out.println();
		}
		
		
		
	}

}
