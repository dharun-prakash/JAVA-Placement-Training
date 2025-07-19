package day10;

import java.util.Scanner;



public class demo {
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);

	    int start = sc.nextInt();
	    int end = sc.nextInt();
	    int sum = 0;

	    for (int i = start; i <= end; i++) {
	        System.out.println(i);
	        for(int j =0 ;j<i;j++) {
	        	int temp = j % 10;
		        sum += temp * temp;
		        System.out.println(sum);
		        j /= 10;
		        System.out.println(j);
	        }
//	        if (i == 0 && sum > 1) {
//	            while (sum != 0) {
//	                int sum1 = 0;
//	                int temp1 = sum % 10;
//	                sum1 = sum1 + temp1 * temp1;
//	                sum = sum / 10;
//	            }
	 //       }

//	        if (sum != 1) {
//	            System.out.print(i);
//	        }
	    }
	}


}
