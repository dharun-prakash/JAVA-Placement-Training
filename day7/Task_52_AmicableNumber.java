package day7;

import java.util.Scanner;

public class Task_52_AmicableNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 1 ; i < a ; i++) {
			if(a%i==0) {
				sum+=i;
			}
			
		}

		
		for(int i = 1 ; i < b ; i++) {
			if(b%i==0) {
				sum2+=i;
			}
			
		}
		if (sum2 == a && sum == b) {
			System.out.println(a +  " and "+ b+ " is Amicable Number ");
			
		}else {
			System.out.println(a +  " and "+ b+ " not a Amicable Number");
		}
	}
}
