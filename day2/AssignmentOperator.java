package day2;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = obj.nextInt();
		System.out.println("Enter a value ");
		int b = obj.nextInt();
		System.out.println(a=b);
		System.out.println(a*=b);
		System.out.println(a+=b);
		System.out.println(a/=b);
		
	}
	
	

}
