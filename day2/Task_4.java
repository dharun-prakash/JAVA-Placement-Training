package day2;
import java.util.Scanner;

public class Task_4 {
//	find the area of rectangle Formula : area = length * breadth
// convert a give n distance in meters to centimeters 1 meter = 100 cm (1*100)
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
//		find the area of rectangle Formula : area = length * breadth
		
//		System.out.println("Enter the Length :");
//		int length = obj.nextInt();
//		System.out.println("Enter the breadth :");
//		int breadth = obj.nextInt();
//		int area = length * breadth;
//		System.out.println("The Area of Rectangle is " + area);
		
// convert a give n distance in meters to centimeters 1 meter = 100 cm (1*100)
		
		System.out.println("Enter the distance in meter");
		int meter = obj.nextInt();
		int cm = meter*100;
		System.out.println("The centimeter of " + meter + " meter is "+cm);
		
	}

}
