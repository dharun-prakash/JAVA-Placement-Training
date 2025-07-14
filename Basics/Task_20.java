package Basics;

import java.util.Scanner;

//  1 number sum the given number reverse the summed number multiple the summed and reversed number then it is equal to the give number

public class Task_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		int rev = 0;
		int mul = 0;
		int inp = num; //Though i use the num in the while loop and make it as 0 i store the initial num value in temp variable inp
		while(num>0) {
			sum+= num%10;
			num/=10;
		}
		System.out.println("Sum "+sum);
		int FinalSum = sum;//Though i use the sum in the while loop and make it as 0 i store the initial sum value in temp variable FinalSum
		while(sum>0) {
			rev = rev*10 + sum%10;
			sum/=10;
		}
		System.out.println("Rev "+rev);
		System.out.println("Summed value "+FinalSum);
		mul = rev*FinalSum;
		System.out.println("Multiplied "+mul);
		
		if(mul == inp ) {
			System.out.println(inp + " is a Magic Number");
		}
		else {
			System.out.println(inp + " is not a Magic Number");
		}
		
	}

}
