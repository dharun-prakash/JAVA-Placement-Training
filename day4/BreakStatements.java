package day4;

import java.util.Scanner;

public class BreakStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 for (int i = 1;i<n;i++){
			 if(n%i==0) {
//				 break;
//				 continue;
				 return;
			 }
			 else {
				 System.out.println(i);
			 }
		 }
		}

}
