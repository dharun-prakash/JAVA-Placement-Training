package day8;

import java.util.Scanner;

public class Task_55_SumOfDigitUntilOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num%9==0)?9:num%9);
	}

}
