package day9;

import java.util.Scanner;

class FactRec{
	 int fact(int n) {
		if(n==1) { 
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
}


public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FactRec obj = new FactRec();
		System.out.println(obj.fact(n));
		
	}

}
