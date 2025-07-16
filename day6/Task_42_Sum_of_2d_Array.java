package day6;
import java.util.Scanner;

public class Task_42_Sum_of_2d_Array {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int sum = 0;
		int a[][] = new int [size][size];
		for (int i = 0 ; i < size ; i++) {
			for(int j = 0 ; j <size ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0 ; i < size ; i++) {
			for (int j = 0 ; j <size ; j++) {
				sum+=a[i][j];
			}
		}
		System.out.print("Sum of the Matrix is : " +sum);
		
	}

}
