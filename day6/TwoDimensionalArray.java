package day6;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
//		Dynamice way
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = scan.nextInt();	
		System.out.print("Enter the col : ");
		int col = scan.nextInt();
		
		int a[][] = new int[row][col];
		System.out.print("Enter the Elements : ");
		for(int i = 0 ; i < row ;i++) {
			for (int j = 0 ; j< col ;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("The Matrix is ");
				
				
//		int a[][] = {{1,2,3},{4,5,6}};  
//				static way 
		
		for(int i = 0; i <a.length ;i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
