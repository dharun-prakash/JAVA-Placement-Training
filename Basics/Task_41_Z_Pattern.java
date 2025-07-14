package Basics;

import java.util.Scanner;

public class Task_41_Z_Pattern {
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	for(int i = 0; i<a ; i++) {
			for(int j = 0 ; j <a;j++) {
				if ( i==0  ||  i +j == a-1  || i == a-1 )  {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
	
				
		}
			System.out.println();
	}
}

}
