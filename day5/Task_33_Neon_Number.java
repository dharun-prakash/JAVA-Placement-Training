package day5;
import java.util.Scanner;

//Find Neon in an array
public class Task_33_Neon_Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		int a[] = new int[size];

		for(int i = 0 ; i <size;i++) {
			a[i] = scan.nextInt();
		}
		 for (int i = 0 ; i < size ; i++) {
			 int num = a[i];
			 int sq = a[i]*a[i];
				int sum = 0;
			 while(sq > 0) {
				 sum+=sq%10;
				 sq/=10;
			 }
			 if (sum == num) {
				 System.out.println(num + "neon");
				 System.out.println(sum + "neon");
				 
			 }
			 else {
				 System.out.println(num + "not neon");
				 System.out.println(num + "not neon");
				 
			 }
		 }
		
	}

}
