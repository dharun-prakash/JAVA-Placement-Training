package day10;
  
import java.util.Scanner;



public class Task_67_FindTheMissingValueInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = sc.nextInt();

		int a[] = new int[size];
		for(int i = 0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int newSize = size;
		
		for(int i = 0;i<size;i++) {
			if(a[i]+1 != a[i+1]) {
				System.out.println(a[i]+1);
				size++;
				break;
			}
		}
//		System.out.println("Size :"+newSize);
	}

}
