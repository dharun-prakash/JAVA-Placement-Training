package day7;

import java.util.Scanner;

public class Task_51_FindingFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a ; i++) {
			if(a%i==0) {
				System.out.print(i + " ");
			}

		}
		
	}

}
