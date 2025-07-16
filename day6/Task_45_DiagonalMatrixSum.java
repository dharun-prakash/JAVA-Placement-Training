package day6;

import java.util.Scanner;

public class Task_45_DiagonalMatrixSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int a[][] =  new int [size][size];
		for (int i = 0 ; i <size ; i++) {
			for (int j = 0; j < size ; j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
	for(int i = 0; i<size ; i++) {
			for(int j = 0 ; j <size;j++) {
				if ( i +j == size-1  )  {
//					System.out.print(a[i][j]);
				sum1+=a[i][j];
//				System.out.println(sum2);
			}
				if (i == j ) {
					sum2+=a[i][j];
					System.out.print(a[i][j]+" ");
				System.out.println("sum is "+sum2);
			}	
			}		
		}

	for(int i = 0; i <a.length ;i++) {
		for(int j = 0 ; j < a[i].length ; j++) {

			System.out.print(a[j][i] + " ");
		}
		System.out.println();
	}
	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(sum1 - sum2);
}

}
