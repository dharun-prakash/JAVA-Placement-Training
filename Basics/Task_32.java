package Basics;

import java.util.Scanner;

public class Task_32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Number ");
		int a = scan.nextInt();
		for(int i = 0;i<=a;i++) {
			int sum = 0;
			int sq = i*i;
			while( sq > 0) {
				sum += sq%10;
				sq/=10;
					}
			if(i == sum) {
				System.out.println(i + " is neon");
			}
			else {
				System.out.println(i + " not a neon");
		}
		
	}
	}

}
