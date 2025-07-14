package Basics;

import java.util.Scanner;

public class Task_25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size :");
		int size = scan.nextInt();
		int a[] = new int[size];
		for (int i = 0 ; i < size;i++) {
			a[i] = scan.nextInt();
		}
		for (int j = 0 ; j <size;j++) {
			if (a[j]%2==0) {
				System.out.print(a[j] + " ");
			}

		}
	}

}
