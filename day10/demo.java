package day10;

import java.util.Scanner;



public class demo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int digit = 0;
        for(int i=start;i<=end;i++){
            int sum = 0;
            digit = i*i;
            System.out.println("DIGIt"+digit);
            while(digit>0){
                sum+=digit%10;
                System.out.println("SUM"+sum);
                digit/=10;
            }
            if(sum==i){
            	System.out.println("SUM"+sum);
            	System.out.println("I"+i);
                System.out.print(i+" ");
            }
        }
	}


}
