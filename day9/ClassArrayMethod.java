package day9;

import java.util.Scanner;

public class ClassArrayMethod {
	static void printarray(int a[],int size) {
		for(int i = 0 ; i<size;i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0 ; i <size;i++) {
			a[i] = sc.nextInt();
		}
		
		printarray(a,size);
		
	}

}
