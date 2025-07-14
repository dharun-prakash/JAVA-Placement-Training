package Basics;

import java.util.Scanner;

public class Task_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int inp = scan.nextInt();
		int odd = 0;
		int even = 0;
		int temp = 0;
		int reverse = 0;
		while (inp>0) {
			reverse = reverse*10 + inp%10;
			inp = inp/10;	
		}
		inp = reverse;
		while(inp>0) {
			temp = inp%10;
			if(temp%2==0) {
				even = even*10 + temp;
				inp = inp/10;
				temp = 0;

			}
			else if(temp%2!=0) {
				odd = odd*10 + temp;
				inp = inp/10;
				temp = 0;

			}

		}

		System.out.println("odd : "+odd);
		System.out.println("even : "+even);

		
}

}
