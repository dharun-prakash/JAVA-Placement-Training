package day9;

import java.util.Scanner;

class PrintA{
	void printarray(int a[],int size) {
		int count = 0;
		for(int i = 0 ; i<size;i++) {
			if(a[i] == 0) {
				count++;
			}
		}
		System.out.println(count + " zeros are there");
		
	}

	
}
public class Task_61_CountZeroInArray {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Values");
		for(int i = 0 ; i <size;i++) {
			a[i] = sc.nextInt();
		}
		PrintA prt = new PrintA();
		prt.printarray(a,size);
		
	}

}
