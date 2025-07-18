package day9;

import java.util.Scanner;

class CountNumber{
	int countmethod(int a){
		if(a==0) {
			return 0;
		}else {
			return 1+countmethod(a/10);
		}

	}
}

public class Task_63_Count_The_Number_Recrussion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();


		CountNumber cn = new CountNumber();
		System.out.println(cn.countmethod(a));
		
		
	}

}
