package day11;

import java.util.Scanner;

public class ThrowExceptionBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>12) {
			System.out.println("Greateer than 12");
		}else {
			throw new NullPointerException("No Value");
		}
		
	}

}
