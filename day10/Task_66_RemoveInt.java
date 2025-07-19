package day10;


import java.util.Scanner;

class RemoveInt{
	char[] method1(String inp){
		char a[] = inp.toCharArray();
		for(int i = 0;i < a.length;i++) {
			if(a[i]<=48 || a[i]>=57) {
				System.out.print(a[i]);
				
			}
		}
		return a;
	}
}


public class Task_66_RemoveInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Elements:");
		String inp = sc.nextLine();
//		char a[] = inp.toCharArray();
//		for(int i = 0;i < a.length;i++) {
//			if(a[i]<=48 || a[i]>=57) {
//				System.out.print(a[i]);
//			}
//		}
		
		RemoveInt rem = new RemoveInt();
		rem.method1(inp);
		
	}

}
