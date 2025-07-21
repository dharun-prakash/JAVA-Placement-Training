package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExceptionError {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			System.out.println(a);
		}catch (InputMismatchException e) {
			System.out.println("Input is int");
		}
		
	}

}
