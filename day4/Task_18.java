package day4;

import java.util.Scanner;
//Reverse the input Digit 

public class Task_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int reverse = 0;
		while(num>0) {
		 int digit = num%10;
			 reverse =reverse*10 + digit;
			 num = num/10;

		}
		 System.out.println(reverse);
		
	}

}
