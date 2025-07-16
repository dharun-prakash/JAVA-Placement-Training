package day5;

import java.util.Scanner;

public class Task_34_OddZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = scan.nextInt();
		int a[] = new int[size];
		for(int i = 0 ; i < size ; i++) {
			System.out.print("Enter the "+ i +" Element : ");
			a[i] = scan.nextInt();
		}
		for (int i =0;i<size;i++) {
			if(a[i]%2==0) {
				continue;
			}
			else {
				a[i]= 0;
			}
		}
		for(int i = 0 ; i<size; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
