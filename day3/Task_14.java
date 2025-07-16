package day3;
import java.util.Scanner;

//we are gonna buy a lottery token the eligibilty is above 18 if the token contain number 5000 then the priice money is 5L if the token number is 2000 then the price money is 500 if non of the token no then show better luck next time

public class Task_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int Age = scan.nextInt();
		if (Age >= 18) {
			System.out.println("You are Eligibel");
			System.out.println("Enter Your Token no");
			int Token = scan.nextInt();
			if(Token == 4000) {
				System.out.println("5 Lakh Price");
			}
			else if(Token == 2000) {
				System.out.println("500 Price");
			}
			else {
				System.out.println("Better Luck Next Time");
			}
		}
		else {
			System.out.println("Not Eligbel");
		}
	}

}
