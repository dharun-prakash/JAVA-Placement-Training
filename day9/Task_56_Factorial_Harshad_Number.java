package day9;

import java.util.Scanner;

class Factorial{
	void calFact(int num) {
		int org = num;
		int result = 1;
		for(int i = 1;i<= num ; i++) {
			result = result * i;
		}
		System.out.println("Factorial of " + org + " is " + result);
	}
}

class Harshad extends Factorial{
	void calharsh(int num)  {
		int sum = 0;
		int temp = num;
		while(num != 0) {
			int digit = num%10;
			sum += digit;
			num/=10;
		}
		System.out.println((temp%sum==0)?"Harshad Number":"Not Harshad Number");
	}
}


public class Task_56_Factorial_Harshad_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		Harshad harsh = new Harshad();
		harsh.calFact(num);
		harsh.calharsh(num);
		
	}

}
