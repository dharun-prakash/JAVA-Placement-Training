package day8;

import java.util.Scanner;

public class Task_53_Square_The_Number {
	
	static int power(int a , int b) {
		int c = 1;
		for(int i = 1 ; i <= b;i++) {
			c*=a;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(power(a, b));
		
	}

}
