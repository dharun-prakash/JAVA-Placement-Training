package day4;

import java.util.Scanner;
// NEED TO COUNT THE GIVEN NUMBERS USING WHILE LOOP

public class Task_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i =0;
		while(n>0) {
			n = n/10;
			i++;

		}
		System.out.println(i);
	}

}
