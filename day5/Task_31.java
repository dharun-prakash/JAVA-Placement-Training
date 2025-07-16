package day5;

import java.util.Scanner;

public class Task_31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		System.out.print("Enter the Number ");
		int a = scan.nextInt();
		int num = a;
		a = a*a;
		while( a > 0) {
			temp += a%10;
			a/=10;
		}
		if(num==temp) {
			System.out.println(num + " is neon");
		}
		else {
			System.out.println(num + " not a neon");
		}
		
	}

}
