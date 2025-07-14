package Basics;

import java.io.InputStream;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		int a[] = new int[size];
		System.out.println("Enter "+ size +" elements");
		for (int i=0;i<size;i++) {
			System.out.println("Enter " + i + " element");
			a[i] = scan.nextInt();

		}
		System.out.println("Elements are : ");
		for (int i =0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
