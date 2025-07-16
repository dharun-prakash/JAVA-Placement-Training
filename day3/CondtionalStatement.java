package day3;
import java.util.Scanner;

public class CondtionalStatement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age");
		int Age = scan.nextInt();
		
//		if  condition 
//		if(Age >= 18)
//		{
//			System.out.println("Ready to vote");
//		}
		
//		if else condition
		if(Age >= 18)
		{
			System.out.println("Ready to vote");
		}
		else {
			System.out.println("Not Ready");
		}
	}

}
