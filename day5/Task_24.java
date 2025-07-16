package day5;
import java.util.Scanner;

public class Task_24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size");
		int size = scan.nextInt();
		String a[] = new String[size];
		for (int i = 0 ; i< size ; i++) {
			System.out.print("Enter the " + i + " Element :");
			a[i]=scan.next();
		}
		System.out.println("The Elements are :");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
	}

}
