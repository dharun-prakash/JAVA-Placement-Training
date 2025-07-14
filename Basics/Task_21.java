package Basics;

import java.util.Scanner;

public class Task_21 {
	public static void main(String[] abc) {

		Scanner sc = new Scanner(System.in);

		//int n=sc.nextInt();

//		for (int i=1; i<=n;i++) {

//			System.out.println(i);

//		}

//		int c=0;

//		//prime number

//		for(int j=1;j<=n;j++) {

//			

//			if (n% j==0) {

//				c++;

//			}

//			

//		}

//		System.out.println((c==2)?"yes":"no");

//		
		//Twisted Prime number

		int n=sc.nextInt();
		int c = 0;
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				c++;
			}
		}
			if (c==2) {
				int r=0;
				while (n>0) {
					r=r*10+n%10;
					n/=10;
				}
				for(int j=1;j<=r;j++) {
					if (r%j==0) {
						c++;
					}
				}
				System.out.println((c==2)?"tpn":"ntpn");
			}
		else {

			System.out.println("npn");
		}

}
