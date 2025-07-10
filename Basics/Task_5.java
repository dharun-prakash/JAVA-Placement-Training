package Basics;
import java.util.Scanner;

//Swap the value between a and b

public class Task_5 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = obj.nextInt();
		System.out.println("Enter b value : ");
		int b = obj.nextInt();
		System.out.println("a value is "+a+" b value is " + b);
//		with using 3rd variable
//		int temp = a;
//		 a = b;
//		 b = temp;
		
//     	wihout using 3rd variable 
		
//		a = a+b;   
//		b = a-b;
//		a = a-b;
//		
//     	wihout using 3rd variable 
		
		a = a*b;   
		b = a/b;   
		a = a/b;
		
		System.out.println("After Swap a value is "+a+" b value is " + b);
		
	
	}

}
