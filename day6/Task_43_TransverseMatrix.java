package day6;
import java.util.Scanner;

public class Task_43_TransverseMatrix {
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
		System.out.println("Before Traverse");

		for(int i = 0; i <a.length ;i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
//				a[j][i] = a[i][j];


				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("After Traverse");

		for(int i = 0; i <a.length ;i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
//				a[j][i] = a[i][j];


				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

}
