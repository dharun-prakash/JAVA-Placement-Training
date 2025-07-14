package Basics;

import java.util.Scanner;
//Sum the Digits

public class Task_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int value = 0;
		while (n>0) {
			value = n%10;
			sum+=value;
			 n = n/10;
		}
		System.out.println(sum);
	}

}
