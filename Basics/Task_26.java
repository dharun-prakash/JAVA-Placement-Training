package Basics;

import java.util.Scanner;

public class Task_26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int a[] = new int[size];
		for (int i = 0;i<size ; i++) {
			a[i]=scan.nextInt();
		}
		for (int i = 0 ; i < size ; i++) {
			if (a[i]%5==0) {
				System.out.println(a[i]);
			}
		}
	}

}
