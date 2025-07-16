package day6;

import java.util.Scanner;

public class Task_45_ZeroAllPrimeNumber {
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
		System.out.println("Initial Matrix");
		for(int i = 0; i <a.length ;i++) {
			for(int j = 0 ; j < a[i].length ; j++) {

				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i<size ; i++) {
			for(int j = 0 ; j <size;j++) {
				if ( isPrime (a[i][j]))  {
//				System.out.print(a[i][j]);
				a[i][j] = 0;
			}
			}		
		}
		
		System.out.println("After Matrix");
		for(int i = 0; i <a.length ;i++) {
			for(int j = 0 ; j < a[i].length ; j++) {

				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		
		
	}
	public static boolean isPrime(int n) {
//	    if (n <= 1) return false; // exclude 0 and 1
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) return false; // divisible by other than 1 and itself
	    }
	    return true;
	}


}

