package day5;

import java.util.Scanner;

public class Task_37_A_Pattern {
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	for(int i = 0; i<a ; i++) {
			for(int j = 0 ; j <a;j++) {
				if ( i==0 || j==0 || i == a/2 || j == a-1 )  {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
	
				
		}
			System.out.println();
	}
}
}


