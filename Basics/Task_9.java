package Basics;
import java.util.Scanner;

public class Task_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Height in cm :");
		float height = scan.nextInt();
		height = (height/100);
		System.out.println("Enter the Weight in kg :");
		int weight = scan.nextInt();
		float Total = weight/(height*height);
		System.out.println("BMI is :"+Total);
		System.out.println((Total < 18.5)?"Underweight":(18.5 <= Total && Total <= 24.9)?"Normal Weight":(25 <= Total && Total <= 29.9)?"Over Weight":(30 <= Total )? "Obese":"Enter Correct Value");
		
		
		
		
	}
	

}
