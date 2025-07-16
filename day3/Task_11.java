package day3;
import java.util.Scanner;

public class Task_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int inp = scan.nextInt();
		System.out.println((inp % 100 == 0 )?"Centuary" :"Not Centuary" );
		System.out.println((inp % 100 == 0 && inp % 4 == 0)?"Centuary And Leap year" :"Not Centuary" );
		
	}

}
