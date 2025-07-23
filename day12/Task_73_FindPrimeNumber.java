package day12;
import java.util.Scanner;


public class Task_73_FindPrimeNumber {
	
	static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		for(int i = 2 ; i <=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		
		for(int i=1;i<=inp;i++) {
			if(isPrime(i)) {
				System.out.print(i);
			}
		}
		
		
	}

}
