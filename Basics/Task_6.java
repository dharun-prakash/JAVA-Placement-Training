package Basics;

import java.util.Scanner;

public class Task_6 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1st mark :");
		int mark_1 = obj.nextInt();
		
		System.out.println("Enter 2nd mark :");
		int mark_2 = obj.nextInt();
		System.out.println("Enter 3rd mark :");
		int mark_3 = obj.nextInt();
		System.out.println("Enter 4th mark :");
		int mark_4 = obj.nextInt();
		System.out.println("Enter 5th mark :");
		int mark_5 = obj.nextInt();
		int avg = (mark_1 + mark_2 + mark_3 ) / 3;
		System.out.println(avg);
		System.out.println((avg >= 90)?"A Grade":(avg >= 80)?"B Grade":(avg >= 70)?"C Grade":(avg >= 60)?"D":(avg >= 50));
		
		
		
	}

}
