package Basics;

import java.util.Scanner;

public class Task_29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int sum = 0;
		int a[] = new int[size];
		for(int i = 0 ; i < size ; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0 ; i<size ; i++) {
			if (a[i]%3==0 || a[i]%5==0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of the Array "+sum);
	}

}
