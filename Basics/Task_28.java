package Basics;

import java.util.Scanner;

public class Task_28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int temp = 0;
		int a[] = new int[size];
		for  (int i = 0 ; i < size ; i++) {
			a[i]=scan.nextInt();	
		}
		for(int i = 0; i < size;i++) {
			temp+=a[i];
		}
		System.out.println(temp);
		
	}

}
