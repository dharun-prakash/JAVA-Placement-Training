package day9;

import java.util.Scanner;

class ArrayStar {
	void printmethod(int a[],int size) {
		int count = 0;
		for(int i = 0 ; i<size;i++) {
			if(a[i] == 0) {
				count++;
			}
		}
		System.out.println(count + " zeros are there");
	}
		
	void printmethod(int a) {
		for(int row = 1 ; row <=a;row++) {
			for(int col = 1 ; col <= row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}


public class Task_62_Array_Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the Array");
		int size = sc.nextInt();

		int a[] = new int[size];
		for(int i = 0 ; i <size;i++) {
			a[i] = sc.nextInt();
		}
		ArrayStar arrs = new ArrayStar();
		arrs.printmethod(a,size);
		arrs.printmethod(a.length);
		
		
	}
	

}
