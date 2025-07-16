package day6;

import java.util.Scanner;

public class Task_44_Traverse2ndRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[][] =  new int [size][size];
		for (int i = 0 ; i <size ; i++) {
			for (int j = 0; j < size ; j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
		for(int i = 0; i <size ;i++) {
			if(i%2==0) {
				for(int j = 0 ;j < size ; j++) {
					System.out.print(a[i][j]+ " ");
				}
				
			}
			else {
				for(int j = size-1 ;j >= 0 ; j--) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		
	}
}
