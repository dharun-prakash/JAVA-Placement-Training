package day11;

import java.util.Scanner;

public class Task_70_Y_Pattern {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	for(int i = 0; i<a ; i++) {
			for(int j = 0 ; j <a;j++) {
				if ( i +j == a-1 || i == j )  {
				System.out.print(j + ""+ i);
				System.out.print("*");
			}else {
				System.out.print(" ");
			}		
		}
		System.out.println();
	}
}
	}

