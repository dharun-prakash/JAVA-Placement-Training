package Basics;

public class ArithmaticOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
//		if wanna access the last digit of a integer
		int num = 392429;
		System.out.println(num%10);
		
//		if wanna access the digits except last integer
		System.out.println(num/10);
	}

}
